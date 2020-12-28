package com.ushwamala.javacourse.SpringAnnotations.Components;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach(){}


    public TrackCoach(FortuneService fortuneService) {
        System.out.println("Track coach constructor");
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
    public void destroy() {
        System.out.println("TrackCoach: inside the destroy method.");
    }
}

