package com.example.springcodedemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Lazy
public class TrackCoach implements Coach {

    // define init method
    @PostConstruct
    public void init() {
        System.out.println("in init method" + getClass().getSimpleName());
    }


    // define destroy method
    @PreDestroy
    public void destroy() {
        System.out.println("in destroy method" + getClass().getSimpleName());
    }

    public TrackCoach() {
        System.out.println("in constructor" + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "track you daily workout";
    }
}
