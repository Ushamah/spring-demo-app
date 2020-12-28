package com.ushwamala.javacourse.Spring.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;



    public CricketCoach(){
        System.out.println("Cricket coach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach: inside setter method - setFortuneService");
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
