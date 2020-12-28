package com.ushwamala.javacourse.SpringAnnotations.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;

public class SoccerCoachFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You know you are better than that!";
    }
}
