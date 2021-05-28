package com.go.recipe.model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity{

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
