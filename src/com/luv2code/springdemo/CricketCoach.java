package com.luv2code.springdemo;

import org.springframework.core.env.PropertyResolver;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAdress;
    private String team;

    public CricketCoach(){
        System.out.println("deneme");
    }
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("deneme2");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String processOfWorkout() {
        return "You process is 15%";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    public String getEmailAdress() {
        return emailAdress;
    }

    public String getTeam() {
        return team;
    }
}
