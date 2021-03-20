package com.project.studycubby.studysession;

import java.util.*;
import java.io.*;

//ParentSession initializes the timer, the startSession function and the endSession function in order to send users to a study session for a specified period of time.

public class ParentSession 
{
    static Timer timer;
    protected int sessionLength;
    protected int breakAmount;
    protected int blockLength;
    
    public ParentSession(int seconds)
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
        //timer will count down from blockLength time (minutes) with breakAmount number of breaks. After each break another blockLength timer will count down. When there are no more breaks, call one more Session and then endSession.
        sessionLength = breakAmount + 1;
        
        if(sessionLength != 0)
        {
            System.out.println("This session has started!");
            
            while(breakAmount != 0)
            {
                for(int i = 0; i <= breakAmount; i++)
                {
                    System.out.println("Time to work.");
                    
                    //1800 seconds is equal to 30 minutes
                    new ParentSession(1800);
                    
                    System.out.println("Good work!");
                    System.out.println("Time for a break!");
                    System.out.println("You have 5 minutes.");
                        
                    //300 seconds is equal to 5 minutes
                    new ParentSession(300);
                    
                    System.out.println("The break is over");
                    
                    i++;
                    sessionLength--;
                }
            }
            if(breakAmount == 0)
            {
                System.out.println("Time to work.");
                    
                new ParentSession(1800);
                    
                System.out.println("Good work!");
                
                sessionLength--;
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