package com.project.studycubby.studysession;

import java.util.*;
import java.io.*;

/**
 * ParentSession initializes the timer, the startSession function and the endSession function in order to 
 * send users to a study session for a specified period of time.
**/

public class ParentSession implements StudySession
{

    protected int sessionLength;
    protected int breakAmount;
    protected int blockLength;
    protected int breakLength;
    private Timer timer;
    
    public void startTimer(int seconds)
    {
        timer = new Timer();
        timer.schedule(new Run(), seconds*1000);
    }
    
    public class Run extends TimerTask
    {
        public void run()
        {
            timer.cancel();
        }
    }

    public void startSession() 
    {

        //converting breakLength into seconds
        breakLength *= 60;

        //converting blockLength into seconds
        blockLength *= 60;

        int blockAmount = breakAmount + 1;

        /**
         * timer will count down from blockLength time (minutes) with breakAmount number of breaks. After each break another blockLength 
         * timer will count down. When there are no more breaks, call one more Session and then endSession.
        **/

        if(blockAmount != 0)
        {
            System.out.println("This session has started!");
            
            while(breakAmount != 0)
            {
                for(int i = 0; i < breakAmount; i++, breakAmount--)
                {
                    System.out.println("Time to work.");
                
                    startTimer(blockLength);
                    
                    System.out.println("Good work!");
                    System.out.println("Time for a break!");
                    System.out.println("You have " + breakLength/60 + " minutes.");
                        
                    //300 seconds is equal to 5 minutes
                    startTimer(breakLength);
                    
                    System.out.println("The break is over");
                    
                    blockAmount--;
                }
            }

            if(breakAmount == 0)
            {
                System.out.println("Time to work.");
                    
                startTimer(blockLength);
                    
                System.out.println("Good work!");
                System.out.println("You're all done.");
                
                blockAmount--;
            }
        }
        else
        {
            endSession();
        }
    }

    public void endSession() 
    {
        //ends study session
        if(sessionLength == 0)
        {
            System.out.println("This session has ended.");
        }
    }
}