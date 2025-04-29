package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.service;

import com.example.hexagonal.application.port.out.SaveMultiplicationPort;
import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.repo.MultiplicationJpaRepository;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.mapper.MultiplicationJpaMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
public class SaveMultiplicationJpaAdapter implements SaveMultiplicationPort {

    private final MultiplicationJpaRepository multiplicationJPARepository;
    private final MultiplicationJpaMapper multiplicationJpaMapper;

    @Override
    public void save(Multiplication multiplication) {
        multiplicationJPARepository.save(multiplicationJpaMapper.createEntityFromModel(multiplication));
    }
}
