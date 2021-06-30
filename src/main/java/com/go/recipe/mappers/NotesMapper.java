package com.go.recipe.mappers;

import com.go.recipe.commands.NotesCommand;
import com.go.recipe.model.entities.Notes;
import org.mapstruct.Mapper;

@Mapper
public interface NotesMapper {

    Notes toNotes(NotesCommand notesCommand);

    NotesCommand toNotesCommand(Notes notes);
}
