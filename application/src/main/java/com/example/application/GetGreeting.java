package com.example.application;

import com.example.domain.GreetingService;

public class GetGreeting {
    private final GreetingService greetingService;

    public GetGreeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String execute(String name) {
        return greetingService.greet(name);
    }
}