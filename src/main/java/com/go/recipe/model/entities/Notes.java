package com.go.recipe.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Notes extends BaseEntity {

    @OneToOne()
    private Recipe recipe;

    @Lob
    private String recipeNotes;


}
