package com.project.studycubby.studysession;

public class MiniSession extends ParentSession implements StudySession{

    private int breakLength = 5;

    public MiniSession(int sessionLength) {
        switch(sessionLength) {
            case 10:
                this.sessionLength = 10;
                breakAmount = 0;
                blockLength = 10;
            case 20: 
                this.sessionLength = 20;
                breakAmount = 0;
                blockLength = 20;
            case 45:
                this.sessionLength = 45;
                breakAmount = 1;
                blockLength = 20;
            default:
                System.out.println("An error has occurred during session creation.");
        }

    }

    
}
