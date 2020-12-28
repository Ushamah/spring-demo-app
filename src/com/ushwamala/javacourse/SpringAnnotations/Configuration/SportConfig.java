package com.ushwamala.javacourse.SpringAnnotations.Configuration;

import com.ushwamala.javacourse.Spring.Interfaces.Coach;
import com.ushwamala.javacourse.Spring.Interfaces.FortuneService;
import com.ushwamala.javacourse.SpringAnnotations.Beans.SoccerCoachFortuneService;
import com.ushwamala.javacourse.SpringAnnotations.Beans.SadFortuneService;
import com.ushwamala.javacourse.SpringAnnotations.Beans.SoccerCoach;
import com.ushwamala.javacourse.SpringAnnotations.Beans.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties") //specifies where the input properties are read from
//@ComponentScan("com.ushwamala.javacourse.SpringAnnotations.Beans")
public class SportConfig {

    //define bean for the sadFortuneService
    @Bean
    public FortuneService sadFortuneService(){
        System.out.println(">> Creating the sadFortuneService()");
        return new SadFortuneService();
    }

    //define bean for the swim coach and inject the sadFortuneService() dependency
    @Bean
    public Coach swimCoach(){
        System.out.println(">> Creating the swim coach");
        return new SwimCoach(sadFortuneService());
    }

    @Bean
    public SoccerCoachFortuneService soccerCoachFortuneService(){
        return new SoccerCoachFortuneService();
    }

    @Bean
    public SoccerCoach soccerCoach(){
        return new SoccerCoach(soccerCoachFortuneService());
    }
}
