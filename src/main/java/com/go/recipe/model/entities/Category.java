package com.go.recipe.model.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity{

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
