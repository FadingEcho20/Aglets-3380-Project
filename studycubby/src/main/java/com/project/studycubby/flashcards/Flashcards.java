//created by Narek and Stephanie M.

package com.project.studycubby.flashcards;

//this is the overall constructor class of flashcards
public class Flashcards implements FlashStart
{
    private String subjectName;
    private String subjectNumber;

    public Flashcards()
    {}

    //this is the constructor for flashcards to get the name and number of cards
    public Flashcards(String subjectName, String subjectNumber)
    {
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
    }

    public String getSubjectName() 
    {
        return subjectName;
    }

    public void setSubjectName(String subjectName) 
    {
        this.subjectName = subjectName;
    }

    public String getSubjectNumber() 
    {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) 
    {
        this.subjectNumber = subjectNumber;
    }
    
    public void editFcards()
    {

    }
    
    public void deleteFcards()
    {

    }
    
}