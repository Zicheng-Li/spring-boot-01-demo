package com.example.springcodedemo.rest;

import com.example.springcodedemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
//    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("trackCoach") Coach myCoach){
//            @Qualifier("trackCoach") Coach anotherCoach) {
        System.out.println("in constructor" + getClass().getSimpleName());
        this.myCoach = myCoach;
//        this.anotherCoach = anotherCoach;
    }

//    @Autowired
//    public DemoController(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

//    @Autowired
//    public void dosome(Coach myCoach) {
//        this.myCoach = myCoach;
//    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout() {
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check() {
//        return "Compare the two coaches: coach == anothercoach, " + (myCoach==anotherCoach);
//    }
}
