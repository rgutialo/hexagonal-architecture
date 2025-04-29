package com.example.hexagonal.domain.service.impl;

import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.domain.service.MultiplicationService;

public class MultiplicationServiceImpl implements MultiplicationService {

    @Override
    public Multiplication multiply(int factorA, int factorB) {
        return Multiplication.builder()
                .multiplicand(factorA)
                .multiplyier(factorB)
                .result(factorA * factorB)
                .build();
    }
}
