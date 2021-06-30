package com.go.recipe.mappers;

import com.go.recipe.commands.IngredientCommand;
import com.go.recipe.model.entities.Ingredient;
import org.mapstruct.Mapper;

@Mapper
public interface IngredientMapper {

    Ingredient toIngredient(IngredientCommand ingredientCommand);

    IngredientCommand toRecipeCommand(Ingredient ingredient);
}
