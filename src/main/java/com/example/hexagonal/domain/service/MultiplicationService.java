package com.example.hexagonal.domain.service;

import com.example.hexagonal.domain.model.Multiplication;

public interface MultiplicationService {

    public Multiplication multiply(int factorA, int factorB);
}
