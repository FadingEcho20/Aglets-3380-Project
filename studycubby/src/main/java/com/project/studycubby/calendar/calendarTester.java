package com.project.studycubby.calendar;

import java.io.FileNotFoundException;

public class calendarTester 
{
    public static void main(String args[])
    {
        Calendar calendar = new Calendar();

        calendar.makeList();
        try {
            calendar.createEvent("2/20/2021", 1700, "Attend Meeting", "Meet at 1100 PFT");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
