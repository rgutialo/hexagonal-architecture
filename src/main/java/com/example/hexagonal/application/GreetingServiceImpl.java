package com.example.hexagonal.application;

import com.example.hexagonal.domain.service.GreetingService;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
