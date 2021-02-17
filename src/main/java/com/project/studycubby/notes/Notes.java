package com.project.studycubby.notes;

import java.util.*;

public class Notes implements Notable{

    private String user;
    private String title;
    private Note latestNote;
    private ArrayList<Note> noteFiles = new ArrayList<>(
        List.of(new Note("US History"), new Note("Chemistry"), new Note("Calculus"))
    );

    public Notes(String user) {
        this.user = user;
    }

    public void createNote(String title) {
        setTitle(title);
        latestNote = new Note(this.title);
        noteFiles.add(latestNote);
        System.out.println("A new note named " + title + " has been created.");
    }

    public void createNote(String title, String label) {
        setTitle(title);
        latestNote = new Note(this.title, label);
        noteFiles.add(latestNote);
        System.out.println("A new note named " + title + " has been created.");
    }

    public void editNote(String title) {
        setTitle(title);
        latestNote = noteFiles.get(noteFiles.indexOf(new Note(this.title)));
        System.out.println("The note " + title + " is now being edited.");
    }

    public void deleteNote() {
        this.title = getTitle();
        noteFiles.remove(new Note(this.title));
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

    public Note getLatestNote() {
        return latestNote;
    }

    public void setLatestNote(String title) {
        this.latestNote = noteFiles.get(noteFiles.size()-1);
    }

    public ArrayList<Note> getNoteFiles() {
        return noteFiles;
    }

    @Override
    public String toString() {
        return String.format("The database will now store note files for user: " + user);
    }

    
}