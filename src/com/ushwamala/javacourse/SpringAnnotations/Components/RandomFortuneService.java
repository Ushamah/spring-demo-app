package com.ushwamala.javacourse.SpringAnnotations.Components;

import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    //Load the fortunes array from the properties file
    @Value("${foo.fortunes}")
    private String[] fortunes/* = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    }*/;

    private final Random myRandom = new Random();

    @Override
    public String getFortune() {
        //pick a random string from fortunes and return it
        int index = myRandom.nextInt(fortunes.length);
        System.out.println(index);
        String fortune = fortunes[index];
        return fortune;
    }
}
