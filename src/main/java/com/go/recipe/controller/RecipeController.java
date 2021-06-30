package com.go.recipe.controller;


import com.go.recipe.commands.RecipeCommand;
import com.go.recipe.service.RecipeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/recipe")
public class RecipeController {

private final RecipeService recipeService;

    @GetMapping("/show/{id}")
    public String showById(@PathVariable String id, Model model){
        model.addAttribute("recipe", recipeService.findById(Long.valueOf(id)));
        log.debug("Requested the recipe/show page ");
        return "recipe/show";
    }
    @GetMapping("/new")
    public String newRecipe(Model model){

        model.addAttribute("recipe", new RecipeCommand());

        return "recipe/recipeform";
    }

    @PostMapping()
    public String saveOrUpdate(@ModelAttribute RecipeCommand command){

       RecipeCommand savedCommand = recipeService.saveRecipeCommand(command);

        return "redirect:/recipe/show/" + savedCommand.getId();
    }

}
