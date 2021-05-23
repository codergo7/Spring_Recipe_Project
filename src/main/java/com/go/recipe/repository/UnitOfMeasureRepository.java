package com.go.recipe.repository;

import com.go.recipe.model.entities.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
