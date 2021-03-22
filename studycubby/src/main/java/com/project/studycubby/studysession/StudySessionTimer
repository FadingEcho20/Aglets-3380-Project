package com.project.studycubby.studysession;
import java.util.*;

public class StudySessionTimer 
{
    Timer timer;
    
    public StudySessionTimer(int seconds)
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
}

