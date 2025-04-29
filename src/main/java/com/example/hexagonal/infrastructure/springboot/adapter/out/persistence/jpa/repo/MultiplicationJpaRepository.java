package com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.repo;

import com.example.hexagonal.infrastructure.springboot.adapter.out.persistence.jpa.entity.MultiplicationEntity;
import org.springframework.data.repository.CrudRepository;

public interface MultiplicationJpaRepository extends CrudRepository<MultiplicationEntity, Long> {
    // This interface will automatically be implemented by Spring Data JPA
    // No need to add any methods here
}
