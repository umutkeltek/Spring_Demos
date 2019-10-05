package com.luv2code.springdemo;

public class GolfCoach implements Coach{
    private FortuneService fortuneService;

    public GolfCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your putting skills for 2 hours today";
    }

    @Override
    public String processOfWorkout() {
        return "You process is 15%";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
