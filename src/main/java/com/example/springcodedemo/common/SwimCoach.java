package com.example.springcodedemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor " + this.getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swimming now";
    }
}
