package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.mapper;

import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.entity.MultiplicationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MultiplicationJpaMapper {

    public MultiplicationEntity createEntityFromModel(Multiplication multiplication);

}
