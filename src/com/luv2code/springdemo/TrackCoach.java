package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService){
    fortuneService = theFortuneService;}


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
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }
}