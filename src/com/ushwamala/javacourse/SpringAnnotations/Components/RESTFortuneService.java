package com.ushwamala.javacourse.SpringAnnotations.Components;

import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
