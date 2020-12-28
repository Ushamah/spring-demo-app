package com.ushwamala.javacourse.SpringAnnotations.Apps;

import com.ushwamala.javacourse.SpringAnnotations.Beans.SoccerCoach;
import com.ushwamala.javacourse.SpringAnnotations.Beans.SwimCoach;
import com.ushwamala.javacourse.SpringAnnotations.Configuration.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansConfigDemoApp {
    public static void main(String[] args) {

        //read spring config from a config class which has @Configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //retrieve beans from the defined config class
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        SwimCoach newSwimCoach = context.getBean("swimCoach", SwimCoach.class);
        SoccerCoach soccerCoach = context.getBean("soccerCoach",SoccerCoach.class);

        //call methods on the beans
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println("Email:\t" + swimCoach.getEmail());
        System.out.println("Team:\t" +swimCoach.getTeam());
        System.out.println(soccerCoach.getDailyWorkout());
        System.out.println(soccerCoach.getDailyFortune());

        //Testing the scope
        boolean isSame = (swimCoach == newSwimCoach);
        if (isSame) {
            System.out.println("Scope: Singleton " + swimCoach);
        } else {
            System.out.println("Scope: Prototype " + swimCoach.toString() + "\n" + newSwimCoach.toString());
        }

        //close context
        context.close();
    }
}
