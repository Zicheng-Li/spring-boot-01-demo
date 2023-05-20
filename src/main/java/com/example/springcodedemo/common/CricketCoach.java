package com.example.springcodedemo.common;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach() {
        System.out.println("in constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice cricket for 15 minutes fff";
    }
}
