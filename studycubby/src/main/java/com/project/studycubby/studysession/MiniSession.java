package com.project.studycubby.studysession;

public class MiniSession extends ParentSession
{

    public MiniSession(int sessionLength) 
    {
        breakLength = 5;
        
        switch(sessionLength) 
        {
            case 10:
                this.sessionLength = 10;
                breakAmount = 0;
                blockLength = 10;
                System.out.println("A mini session has started w/ 10 minutes remaining");
                startSession();
                break;
                
            case 20: 
                this.sessionLength = 20;
                breakAmount = 0;
                blockLength = 20;
                System.out.println("A mini session has started w/ 20 minutes remaining");
                startSession();
                break;
                
            case 45:
                this.sessionLength = 45;
                breakAmount = 1;
                blockLength = 20;
                System.out.println("A mini session has started w/ 45 minutes remaining");
                startSession();
                break;
                
            default:
                System.out.println("An error has occurred during session creation.");
        }

    }

    
}