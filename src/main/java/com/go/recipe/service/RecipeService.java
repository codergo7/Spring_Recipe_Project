package com.go.recipe.service;

import com.go.recipe.commands.RecipeCommand;
import com.go.recipe.model.entities.Recipe;

import java.util.List;

public interface RecipeService {

    List<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
}
