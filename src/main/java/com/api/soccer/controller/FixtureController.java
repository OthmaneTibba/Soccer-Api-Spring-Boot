package com.api.soccer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FixtureController {


    @GetMapping("/")
    String test(){
        return "Test";
    }

    @GetMapping("/hello")
    String hello(){
        return "Hello From  .";
    }

    @GetMapping("/welcome")
    String Welcome(){
        return "Welcome  .";
    }
}
