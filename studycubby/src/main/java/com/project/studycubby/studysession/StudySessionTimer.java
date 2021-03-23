package com.project.studycubby.studysession;
import java.util.*;

public class StudySessionTimer 
{
    Timer timer;
    
    //A constructor for a StudySessionTimer object that times different parts of the study session process
    //Developed by: Jayme E.
    public StudySessionTimer(int seconds)
    {
        timer = new Timer();
        timer.schedule(new Run(), seconds*1000);
    }
    
    //A method used to run and stop the StudySessionTimer
    //Developed by Jayme E.
    private class Run extends TimerTask
    {
        public void run()
        {
            timer.cancel();
        }
    }
}

