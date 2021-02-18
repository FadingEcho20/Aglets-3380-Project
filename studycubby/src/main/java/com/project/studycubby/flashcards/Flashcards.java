package com.project.studycubby.flashcards;

public class Flashcards implements FlashStart
{
    private String subjectName;
    private String subjectNumber;

    public Flashcards()
    {}

    public Flashcards(String subjectName, String subjectNumber)
    {
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }
    public void editFcards()
    {

    }
    public void deleteFcards()
    {

    }
}
