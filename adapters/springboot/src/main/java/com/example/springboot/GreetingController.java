package com.example.springboot;

import com.example.application.GetGreeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    private final GetGreeting getGreeting;

    public GreetingController(GreetingServiceImpl greetingService) {
        this.getGreeting = new GetGreeting(greetingService);
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return getGreeting.execute(name);
    }
}