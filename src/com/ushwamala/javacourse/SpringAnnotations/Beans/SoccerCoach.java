package com.ushwamala.javacourse.SpringAnnotations.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;

public class SoccerCoach implements Coach {

    private final FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        System.out.println(">> Creating the soccer coach");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 30 rounds for worming up!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
