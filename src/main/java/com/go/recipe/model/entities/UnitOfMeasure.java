package com.go.recipe.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class UnitOfMeasure extends BaseEntity{

    private String description;
}
