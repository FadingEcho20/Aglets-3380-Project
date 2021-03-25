package com.project.studycubby.calendar;

import java.io.FileNotFoundException;

public class calendarTester 
{
    public static void main(String args[])
    {
        Calendar calendar = new Calendar();

        try {
            calendar.createEvent("2/20/2021", 1900, "Attend Meeting", "Meet at 2272 PFT");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
