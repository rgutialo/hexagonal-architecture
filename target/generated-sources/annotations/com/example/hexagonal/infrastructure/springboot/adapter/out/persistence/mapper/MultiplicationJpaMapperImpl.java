package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.mapper;

import com.example.hexagonal.domain.model.Multiplication;
import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.entity.MultiplicationEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-29T16:06:45+0200",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class MultiplicationJpaMapperImpl implements MultiplicationJpaMapper {

    @Override
    public MultiplicationEntity createEntityFromModel(Multiplication multiplication) {
        if ( multiplication == null ) {
            return null;
        }

        MultiplicationEntity multiplicationEntity = new MultiplicationEntity();

        multiplicationEntity.setMultiplicand( multiplication.getMultiplicand() );
        multiplicationEntity.setMultiplyier( multiplication.getMultiplyier() );
        multiplicationEntity.setResult( multiplication.getResult() );

        return multiplicationEntity;
    }
}
