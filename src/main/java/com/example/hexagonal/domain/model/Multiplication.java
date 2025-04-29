package com.example.hexagonal.domain.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class Multiplication {
    private int multiplicand;
    private int multiplyier;
    private int result;
}
