package com.ushwamala.javacourse.Spring.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
    private FortuneService fortuneService;

    public TrackCoach(){}

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It! " + fortuneService.getFortune();
    }

    //add an init method
    public void init(){
        System.out.println("TrackCoach: inside the init method.");
    }

    //add a destroy method
    @Override
    public void destroy() {
        System.out.println("TrackCoach: inside the destroy method.");
    }
}
