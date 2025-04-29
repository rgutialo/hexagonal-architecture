package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.mapper;

import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.entity.MultiplicationCSV;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MultiplicationCsvMapper {

    MultiplicationCSV createCsvFromModel(Multiplication multiplication);
}
