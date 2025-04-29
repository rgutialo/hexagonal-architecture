package com.example.hexagonal.application.port.out;

import com.example.hexagonal.domain.model.Multiplication;

public interface SaveMultiplicationPort {

    void save(Multiplication multiplication);
}
