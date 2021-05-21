package com.go.recipe.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UniteOfMeasure {

    @Id
    @GeneratedValue
    private Long id;

    private String description;
}
