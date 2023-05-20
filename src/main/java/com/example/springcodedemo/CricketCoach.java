package com.example.springcodedemo;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "practice cricket for 15 minutes";
    }
}
