package com.go.recipe.mappers;

import com.go.recipe.commands.CategoryCommand;
import com.go.recipe.model.entities.Category;
import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {

    Category toCategory(CategoryCommand categoryCommand);

    CategoryCommand toCategoryCommand(Category command);
}
