package com.project.studycubby.flashcards;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlashcardService
{
    public List<Flashcards> getFlashcards(){
        return List.of(
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

