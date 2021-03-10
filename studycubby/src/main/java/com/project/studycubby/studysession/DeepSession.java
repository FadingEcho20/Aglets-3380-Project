package com.project.studycubby.studysession;

public class DeepSession extends ParentSession implements StudySession{

    public DeepSession(int sessionLength) {
        breakLength = 10;
        switch(sessionLength) {
            case 50:
                this.sessionLength = 50;
                breakAmount = 0;
                blockLength = 50;
                break;
            case 110: 
                this.sessionLength = 110;
                breakAmount = 1;
                blockLength = 50;
                break;
            case 170:
                this.sessionLength = 170;
                breakAmount = 2;
                blockLength = 50;
                break;
            case 230:
            this.sessionLength = 230;
            breakAmount = 3;
            blockLength = 50;
            break;
            default:
                System.out.println("An error has occurred during session creation.");
        }

    }
    
}
