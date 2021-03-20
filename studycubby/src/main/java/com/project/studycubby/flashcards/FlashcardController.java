package com.project.studycubby.flashcards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "flashcards/")
public class FlashcardController
{
    private final FlashcardService flashcardService;

    @Autowired
    public FlashcardController(FlashcardService flashcardService)
    {
        this.flashcardService = flashcardService;
    }

    @GetMapping
    public List<Flashcards> getFlashacrds()
    {
        return flashcardService.getFlashcards();
    }

}