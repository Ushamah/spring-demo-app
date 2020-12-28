package com.ushwamala.javacourse.Spring.Apps;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //Load the spring configuration  file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach",Coach.class);

        //call methods on the bean
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());

        //call new method for fortunes
        System.out.println(baseballCoach.getDailyFortune());
        System.out.println(trackCoach.getDailyFortune());


        //close the context
        context.close();
    }
}
