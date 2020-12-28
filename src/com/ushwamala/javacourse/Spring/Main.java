package com.ushwamala.javacourse.Spring;

import com.ushwamala.javacourse.Spring.Beans.BaseballCoach;
import com.ushwamala.javacourse.Spring.Beans.HappyFortuneService;
import com.ushwamala.javacourse.Spring.Beans.TrackCoach;
import com.ushwamala.javacourse.Spring.Interfaces.Coach;

public class Main {

    public static void main(String[] args) {

        Coach baseballCoach = new BaseballCoach(new HappyFortuneService());
        System.out.println("The baseball coach says: " + baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());

        Coach trackCoach = new TrackCoach();
        System.out.println("The track coach says: " + trackCoach.getDailyWorkout());

    }
}
