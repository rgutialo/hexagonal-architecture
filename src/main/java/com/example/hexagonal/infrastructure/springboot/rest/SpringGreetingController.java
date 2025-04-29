package com.example.hexagonal.infrastructure.springboot.rest;

import com.example.hexagonal.domain.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring/greet")
@AllArgsConstructor
public class SpringGreetingController {

    private final GreetingService greetingService;

    @GetMapping
    public String greet(@RequestParam(name="name", defaultValue = "World") String name) {
        return greetingService.greet(name);
    }
}
