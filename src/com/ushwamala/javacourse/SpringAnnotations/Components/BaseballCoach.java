package com.ushwamala.javacourse.SpringAnnotations.Components;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component("baseballCoach")
public class BaseballCoach implements Coach {

    private  FortuneService fortuneService;

    public BaseballCoach(){
    }

    public BaseballCoach(FortuneService fortuneService) {
        System.out.println("Baseball coach constructor");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
