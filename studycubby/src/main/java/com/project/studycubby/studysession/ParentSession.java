package com.project.studycubby.studysession;

/*
 * ParentSession initializes the startSession, startBreak and endSession functions in order to 
 * send users to a study session for a specified period of time.
*/

public class ParentSession implements StudySession
{

    protected int sessionLength;
    protected int breakAmount;
    protected int blockLength;
    protected int breakLength;
    protected boolean isStudying = true;


    /*
    * A method that will start the study session by calling a StudySessionTimer object.
    *
    * the timer will count down from blockLength time (minutes) with breakAmount number of breaks (startBreak). After 
    * each break, another blockLength timer will count down. When there are no more breaks, call one more startSession 
    * and then endSession.
    *
    * Developed by: Jayme E.
    */

    public void startSession() 
    {

        System.out.println("Time to work!");
        System.out.println("You have " + blockLength/60 + " minutes");
        new StudySessionTimer(blockLength, this, isStudying);
        //new StudySessionTimer(15, this, isStudying);

    }

    //A method that starts a break by calling a StudySessionTimer object
    //Developed by Jayme E.
    public void startBreak() 
    {

        System.out.println("Time for a break...");
        System.out.println("You have " + breakLength/60 + " minutes");

        breakAmount--;
        new StudySessionTimer(breakLength, this);
        //new StudySessionTimer(5, this);
    }

    //A method to signal the end of the study session
    //Developed by Jayme E.
    public void endSession() 
    {
        System.out.println("You're all done!");
        System.out.println("This session has ended.");
    }

}