package com.project.studycubby.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping(path = "api/v1/notes")
public class NotesController 
{

    @GetMapping
	public List<Notes> getUserNotes() 
        {
		return List.of
                (
			new Notes("The Notes")
		);
	}
    
}