package com.example.hexagonal.infrastructure.springboot;

import com.example.hexagonal.application.GreetingServiceImpl;
import com.example.hexagonal.application.port.out.SaveMultiplicationPort;
import com.example.hexagonal.domain.service.GreetingService;
import com.example.hexagonal.domain.service.MultiplicationService;
import com.example.hexagonal.domain.service.impl.MultiplicationServiceImpl;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.mapper.MultiplicationCsvMapper;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.repository.SaveMultiplicationCSVAdapter;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.repo.MultiplicationJpaRepository;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.mapper.MultiplicationJpaMapper;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.service.SaveMultiplicationJpaAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootConfig {

    @Bean
    public GreetingService greetingService() {
        return new GreetingServiceImpl();
    }

    @Bean
    public MultiplicationService multiplicationService() {
        return new MultiplicationServiceImpl();
    }
/*
    @Bean
    public SaveMultiplicationPort saveMultiplicationPort(final MultiplicationJpaRepository multiplicationJpaRepository,
                                                         final MultiplicationJpaMapper multiplicationJpaMapper) {
        return new SaveMultiplicationJpaAdapter(multiplicationJpaRepository, multiplicationJpaMapper);
    }
*/
    @Bean
    public SaveMultiplicationPort saveMultiplicationPort(final MultiplicationCsvMapper multiplicationCsvMapper) {
        return new SaveMultiplicationCSVAdapter(multiplicationCsvMapper);
    }
}
