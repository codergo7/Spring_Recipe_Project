package com.go.recipe.mappers;

import com.go.recipe.commands.UnitOfMeasureCommand;
import com.go.recipe.model.entities.UnitOfMeasure;
import org.mapstruct.Mapper;

@Mapper
public interface UnitOfMeasureMapper {

    UnitOfMeasure toUnitOfMeasure(UnitOfMeasureCommand unitOfMeasureCommand);

    UnitOfMeasureCommand toUnitOfMeasureCommand(UnitOfMeasure unitOfMeasure);
}
