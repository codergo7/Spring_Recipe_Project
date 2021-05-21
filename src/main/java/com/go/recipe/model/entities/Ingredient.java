package com.go.recipe.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
public class Ingredient {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UniteOfMeasure uom;

    @ManyToOne
    private Recipe recipe;
}
