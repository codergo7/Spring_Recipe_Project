package com.go.recipe.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
public class Category extends BaseEntity{

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
