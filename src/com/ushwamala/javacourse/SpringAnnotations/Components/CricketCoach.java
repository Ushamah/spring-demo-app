package com.ushwamala.javacourse.SpringAnnotations.Components;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component("cricketCoach")
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket coach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach: inside setter method - setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        System.out.println("Cricket coach: inside getter method - getEmailAddress");
        return emailAddress;
    }

    public String getTeam() {
        System.out.println("Cricket coach: inside getter method - getTeam");
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
