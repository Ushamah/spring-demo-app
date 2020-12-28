package com.ushwamala.javacourse.SpringAnnotations.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private final FortuneService fortuneService;

    //Inject values from sport properties file
    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
