package com.go.recipe.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
