package com.ushwamala.javacourse.SpringAnnotations.Beans;

import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is a sad day :(";
    }
}
