package com.project.studycubby.calendar;

import java.io.FileNotFoundException;

public class calendarTester 
{
    public static void main(String args[])
    {
        Calendar calendar = new Calendar();

        try {
            calendar.createEvent("8/17/2021", 0000, "Kalob's Birthday", "Cookie cake pls");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}
