package com.go.recipe.mappers;

import com.go.recipe.commands.RecipeCommand;
import com.go.recipe.model.entities.Recipe;
import org.mapstruct.Mapper;

@Mapper
public interface RecipeMapper {

    Recipe toRecipe(RecipeCommand recipeCommand);

    RecipeCommand toRecipeCommand(Recipe recipe);
}
