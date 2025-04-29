package com.example.hexagonal.infrastructure.springboot;

import com.example.hexagonal.domain.service.GreetingService;
import com.example.hexagonal.application.GreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }
}
