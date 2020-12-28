package com.ushwamala.javacourse.SpringAnnotations.Components;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component//indicates that the class is a bean
@Scope("singleton")//Sets the scope. Note that if scope = "prototype", the @PreDestroy method won't be called
public class TennisCoach implements Coach {

    @Autowired//injects the service into the bean
    @Qualifier("fileFortuneService")//specifies which service is being injected if there is many services
    private FortuneService fortuneService;

    @Value("${foo.email}") //injecting the email value from the properties file
    private String email;

    @Value("${foo.team}") //injecting the team value from the properties file
    private String team;

    @PostConstruct// indicates the init method
    public void firstThingToDo() {
        System.out.println(">> TennisCoach: inside the firstThingToDo() method");
    }

    public TennisCoach (){
        System.out.println(">> Tennis coach: inside default constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> Tennis coach: Inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return "Email:\t" + email;
    }

    public String getTeam() {
        return "Team:\t" + team;
    }

    @PreDestroy //indicates the destroy method
    public void lastThingToDo(){
        System.out.println(">> TennisCoach: inside the lastThingToDo() method");
    }
}
