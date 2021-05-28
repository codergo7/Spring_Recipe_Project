package com.go.recipe.model.entities;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CategoryTest {

    Category category;

    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        category.setId(5L);

        assertEquals(new Long(5L), category.getId());
    }

    @Test
    void getDescription() {
        category.setDescription("This is a description for test");

        assertEquals("This is a description for test", category.getDescription());
    }

    @Test
    void getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        category.setRecipes(recipes);

        assertEquals(recipes,category.getRecipes());
    }
}