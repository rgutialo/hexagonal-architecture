package com.example.hexagonal.infrastructure.spring;

import com.example.hexagonal.application.GreetingService;
import com.example.hexagonal.application.GreetingServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring/greet")
public class SpringGreetingController {

    private final GreetingService greetingService = new GreetingServiceImpl();

    @GetMapping
    public String greet(@RequestParam(defaultValue = "World") String name) {
        return greetingService.greet(name);
    }
}
