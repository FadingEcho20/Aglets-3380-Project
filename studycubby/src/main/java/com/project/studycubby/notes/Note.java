package com.project.studycubby.notes;

import java.io.File;
import java.io.IOException;

public class Note 
{

    //this object has the note name, label, and text file
    private String name;
    private String label;
    private File noteFile;

    //constructor for a note that just has a name
    public Note(String name) 
    {
        this.name = name;
        createNoteFile();
    }

    //constructor for a note that has a name in label (we aren't using labels in the prototype)
    public Note(String name, String label) 
    {
        this.name = name;
        this.label = label;
        createNoteFile();
    }

    //method to create a text file with the name "name.txt" where name has been stored in the name variable of the object
    private void createNoteFile() 
    {
        try 
        {
            noteFile = new File(name + ".txt");
            if (noteFile.createNewFile()) 
            {
                System.out.println("File created: " + noteFile.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("File could not be created.");
            e.printStackTrace();
        }
    }

    //not implemented; should get the text file
    public File getNoteFile() 
    {
        return this.noteFile;
    }

}