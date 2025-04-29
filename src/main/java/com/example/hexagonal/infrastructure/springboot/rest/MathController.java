package com.example.hexagonal.infrastructure.springboot.rest;

import com.example.hexagonal.application.port.out.SaveMultiplicationPort;
import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.domain.service.MultiplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring/math")
@AllArgsConstructor
public class MathController {

    private final MultiplicationService multiplicationService;
    private final SaveMultiplicationPort saveMultiplicationPort;

    @GetMapping
    public String greet(@RequestParam(name="multiplicand") int multiplicand, @RequestParam(name="multiplyer") int multiplyer) {
        Multiplication multiplicationResult = multiplicationService.multiply(multiplicand, multiplyer);
        saveMultiplicationPort.save(multiplicationResult);
        return "hello world!";
    }
}
