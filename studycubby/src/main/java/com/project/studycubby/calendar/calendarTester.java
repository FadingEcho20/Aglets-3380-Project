package com.project.studycubby.calendar;

import java.io.FileNotFoundException;

public class calendarTester 
{
    public static void main(String args[])
    {
        Calendar calendar = new Calendar();

        try {
            calendar.createEvent("12/25/2021", 0000, "Merry Christmas", "Happy Holidays");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
