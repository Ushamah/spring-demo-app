package com.ushwamala.javacourse.Spring.Apps;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve beans from spring container
        Coach trackCoachA = context.getBean("trackCoach", Coach.class);
        Coach trackCoachB = context.getBean("trackCoach", Coach.class);

        //Check if these are the same beans
        boolean sameBean = (trackCoachA == trackCoachB);
        if(sameBean){
            System.out.println("The scope = singleTon");
        } else{
            System.out.println("The scope = protoType");
        }
        System.out.println("Memory Location of coachA = " + trackCoachA +
                "\n" + "Memory location of coachB = " + trackCoachB);

        context.close();

    }
}
