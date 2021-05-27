package com.go.recipe.model.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Notes extends BaseEntity {

    @OneToOne()
    private Recipe recipe;

    @Lob
    private String recipeNotes;


}
