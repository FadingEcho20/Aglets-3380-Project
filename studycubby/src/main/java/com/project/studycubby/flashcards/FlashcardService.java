//created by Narek and Stephanie M.

package com.project.studycubby.flashcards;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashcardService
{
    
    public List<Flashcards> getFlashcards()
    {
        // hard coding of flashcards for examples
        // hopeful goal is for user to be able insert their own name and number
        // but this is a stretch feature
        
        return List.of
        (
                new Flashcards("Biology",
                        "101"),
                new Flashcards("Biology",
                        "102"),
                new Flashcards("Astronomy",
                        "101"),
                new Flashcards("Astronomy",
                        "102"),
                new Flashcards("Spanish",
                        "101"),
                new Flashcards("Chemistry",
                        "101")
        );
        
    }
    
}