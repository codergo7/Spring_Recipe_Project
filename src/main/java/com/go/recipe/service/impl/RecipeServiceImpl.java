package com.go.recipe.service.impl;

import com.go.recipe.commands.RecipeCommand;
import com.go.recipe.converters.RecipeCommandToRecipe;
import com.go.recipe.converters.RecipeToRecipeCommand;
import com.go.recipe.model.entities.Recipe;
import com.go.recipe.repository.RecipeRepository;
import com.go.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    HashMap<String, ArrayList<Integer>> hm = new HashMap();


    private final RecipeRepository recipeRepository;
   // private final RecipeMapper mapper;


    private final RecipeCommandToRecipe recipeCommandToRecipe;


    private final RecipeToRecipeCommand recipeToRecipeCommand;


    @Override
    public List<Recipe> getRecipes() {


        log.debug("I`m in the service");

        /**
         * if you implement CrudRepository, you should use  Iterable<T> findAll();
         */
        /*Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
        */

        return recipeRepository.findAll();
    }

    @Override
    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand) {
        //Recipe recipeMapped = mapper.toRecipe(recipeCommand);
        Recipe recipeConverted = recipeCommandToRecipe.convert(recipeCommand);
        Recipe recipeSaved = recipeRepository.save(recipeConverted);
        log.debug("Saved RecipeId: " + recipeSaved.getId());
       // return mapper.toRecipeCommand(recipeSaved);
        return recipeToRecipeCommand.convert(recipeSaved);
    }


}
