package com.example.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("in constructor" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "tennis workout";
    }
}
