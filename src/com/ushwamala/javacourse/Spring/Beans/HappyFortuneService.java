package com.ushwamala.javacourse.Spring.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
