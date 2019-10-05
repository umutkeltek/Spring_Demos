package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach theCoach1 = context.getBean("myCricketCoach", CricketCoach.class);
        GolfCoach theCoach2 = context.getBean("myGolfCoach", GolfCoach.class);

        System.out.println(theCoach1.getDailyFortune());
        System.out.println(theCoach1.getDailyWorkout());
        System.out.println(theCoach1.getEmailAdress());
        System.out.println(theCoach1.getTeam());

        System.out.println(theCoach2.getDailyFortune());
        context.close();
    }
}
