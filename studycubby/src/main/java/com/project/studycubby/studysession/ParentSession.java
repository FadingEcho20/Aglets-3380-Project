package com.project.studycubby.studysession;

import java.util.*;

public class ParentSession {

    protected int sessionLength;
    protected int breakAmount;
    protected ArrayList<String> subjects = new ArrayList<>();
    protected int blockLength;

    protected void timer() {
        //a timer will be implemented here
    }

    public void startSession() {
        //timer will count down from blockLength time (minutes) with breakAmount number of breaks. After each break another blockLength timer will count down. When there are no more breaks, call endSession.
    }

    public void endSession() {
        //ends study session
    }

    public void setSubjects() {
        switch(breakAmount) {
            case 1:
                //user inputs 2 subjects
            case 2:
                //user inputs 3 subjects
            case 3: 
                //user inputs 4 subjects
            default:
                //user inputs 1 subject
        }
    }
    
}
