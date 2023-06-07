package com.api.soccer.controller;


import com.api.soccer.model.Fixture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FixtureController {


    @GetMapping("/")
    Fixture getAllFixtures(){
        return new Fixture(
                "Welcome to Soccer Api"
        );
    }


}
