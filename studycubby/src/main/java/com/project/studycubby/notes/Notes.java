package com.project.studycubby.notes;

import java.util.*;

public class Notes implements Notable{

    private String user;
    private String title;
    private ArrayList<String> noteFiles;

    public Notes(String user) {
        this.user = user;
    }

    public void createNote(String title) {
        this.title = title;
        noteFiles.add(title);
        System.out.println("A new note named " + title + " has been created.");
    }

    public void editNote(String title) {
        this.title = title;
        System.out.println("The note " + title + " is now being edited.");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getNoteFiles() {
        return noteFiles;
    }

    @Override
    public String toString() {
        return String.format("The database will now store note files for user: " + user);
    }

    
}