package com.go.recipe.service.impl;

import com.go.recipe.model.entities.Recipe;
import com.go.recipe.repository.RecipeRepository;
import com.go.recipe.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        List<Recipe> recipeList = new ArrayList();
        recipeList.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipeList);
        when(recipeRepository.findAll()).thenReturn(recipeList);

        List<Recipe> recipes = recipeService.getRecipes();

        assertEquals(1,recipes.size());
        verify(recipeRepository, times(1)).findAll();
    }
}