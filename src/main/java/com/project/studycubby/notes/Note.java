package com.project.studycubby.notes;

import java.io.File;
import java.io.IOException;

public class Note {

    private String name;
    private String label;
    private File noteFile;

    public Note(String name) {
        this.name = name;
        createNoteFile();
    }

    public Note(String name, String label) {
        this.name = name;
        this.label = label;
        createNoteFile();
    }

    private void createNoteFile() {
        try {
            noteFile = new File(name + ".txt");
            if (noteFile.createNewFile()) {
                System.out.println("File created: " + noteFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("File could not be created.");
            e.printStackTrace();
        }
    }

    public File getNoteFile() {
        return this.noteFile;
    }

}
