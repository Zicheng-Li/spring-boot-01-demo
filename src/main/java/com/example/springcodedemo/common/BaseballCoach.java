package com.example.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("in constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "baseball workout";
    }
}
