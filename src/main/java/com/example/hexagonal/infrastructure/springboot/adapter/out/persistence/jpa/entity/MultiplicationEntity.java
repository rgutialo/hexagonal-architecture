package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "multiplication")
public class MultiplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "multiplicand", nullable = false)
    private Integer multiplicand;

    @Column(name = "multiplyier", nullable = false)
    private Integer multiplyier;

    @Column(name = "result", nullable = false)
    private Integer result;
}
