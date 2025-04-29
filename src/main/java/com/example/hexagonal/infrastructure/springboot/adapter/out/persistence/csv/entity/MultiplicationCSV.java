package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.csv.entity;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MultiplicationCSV {

    private Integer id;
    private Integer multiplicand;
    private Integer multiplyier;
    private Integer result;
}
