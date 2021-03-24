package com.project.studycubby.studysession;
import java.util.*;

public class StudySessionTimer 
{
    Timer timer;
    ParentSession current;

    /*
    * A set of constructors for a StudySessionTimer object that times different parts of 
    * the study session process (study block vs break) and calls the next part of the process.
    * the boolean in the consrtuctor distinguishes between the sources of the object call.
    * Developed by: Jayme E. & LaSean S.
    */

    public StudySessionTimer(int seconds, ParentSession current, boolean type)
    {
        this.current = current;
        timer = new Timer();
        timer.schedule(new StudyRun(), seconds*1000);
    }

    public StudySessionTimer(int seconds, ParentSession current)
    {
        this.current = current;
        timer = new Timer();
        timer.schedule(new BreakRun(), seconds*1000);
    }
    
    //A set of objects that indicate the action a timer must take after the specified delay depending on the current use
    //Developed by Jayme E. & LaSean S.
    class StudyRun extends TimerTask
    {
        public void run()
        {
            System.out.println("Good work!");

            switch(current.breakAmount) {

                case 0:
                current.endSession();
                timer.cancel();
                break;

                default:
                current.startBreak();
                timer.cancel();

            }
        }
    }

    class BreakRun extends TimerTask
    {
        public void run()
        {
            System.out.println("Your break is over.");

            current.startSession();
            timer.cancel();
        }
    }
}

