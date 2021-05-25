package com.go.recipe.service.impl;

import com.go.recipe.model.entities.Recipe;
import com.go.recipe.repository.RecipeRepository;
import com.go.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Override
    public List<Recipe> getRecipes() {

        /**
         * if you implement CrudRepository, you should use  Iterable<T> findAll();
         */
        /*Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
        */

        return recipeRepository.findAll();
    }
}
