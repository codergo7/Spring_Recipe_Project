package com.go.recipe.service;

import com.go.recipe.model.entities.Recipe;

import java.util.List;
import java.util.Set;

public interface RecipeService {

    List<Recipe> getRecipes();
    Recipe findById(Long id);
}
