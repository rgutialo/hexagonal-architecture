package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.mapper;

import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.entity.MultiplicationCSV;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-29T16:06:45+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class MultiplicationCsvMapperImpl implements MultiplicationCsvMapper {

    @Override
    public MultiplicationCSV createCsvFromModel(Multiplication multiplication) {
        if ( multiplication == null ) {
            return null;
        }

        MultiplicationCSV.MultiplicationCSVBuilder multiplicationCSV = MultiplicationCSV.builder();

        multiplicationCSV.multiplicand( multiplication.getMultiplicand() );
        multiplicationCSV.multiplyier( multiplication.getMultiplyier() );
        multiplicationCSV.result( multiplication.getResult() );

        return multiplicationCSV.build();
    }
}
