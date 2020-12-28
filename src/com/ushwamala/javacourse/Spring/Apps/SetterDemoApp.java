package com.ushwamala.javacourse.Spring.Apps;

import com.ushwamala.javacourse.Spring.Beans.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        //load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);


        //call methods on the bean
        System.out.println();
        System.out.println("Calling methods on the retrieved beans");
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());

        //call methods to get the literal values
        System.out.println();
        System.out.println("Calling the injected literal values");
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());

        //close the context
        context.close();


    }
}
