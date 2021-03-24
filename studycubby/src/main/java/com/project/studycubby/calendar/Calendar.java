/**
 * This class provides methods for managing a list of events on a text file.
 * Events are written on the text file in the following format:
 * 
 * Date(mm/dd/yyyy)     Time(hhmm - 24h)        Name        description
 * String               int                     String      String
 * 
 * @author Kalob Morel, Narek Bayramyan
 * @since 3/23/2021
 */
package com.project.studycubby.calendar;

import java.io.*;
import java.util.*;

public class Calendar implements calendarInterface
{
    /**
     * This method  will receive the details of an event, then scan the events list to find out where to put it.
     * It will then make a temporary file with all of the previously written events and insert the new event into the list.
     * The temporary list is completed based on the original list and is used to overwrite the original list.
     * 
     * @throws FileNotFoundException
     * @param String [date]     - string representation of the date given in mm/dd/yyyy format
     * @param String [name]     - name of the event
     * @param String [description]  - description of the event
     * 
     * @author Kalob Morel
     * @since 3/23/2021
     */
    public void createEvent(String date, int time, String name, String desc) throws FileNotFoundException
    {
        //create file stream from Events.txt
        File Events = new File("E:\\Aglets\\Events.txt");
        Scanner reader = new Scanner(Events);

        //create file stream from tmpList.txt
        File tmpList = new File("E:\\Aglets\\tmpList.txt");

        //compare name loop to find insert location
        reader.nextLine();
        reader.next();
        reader.next();

        String curName = reader.next();
        int lineNum = 1;

        while(curName.compareTo(name) < 1)
        {
            lineNum ++;

            reader.nextLine();
            reader.next();
            reader.next();

            curName = reader.next();
        }

        //copy from original list to tmpList

        //write new event

        //continue copying original list from line: (linenum + 1)

        reader.close();
    }

    /**
     * This method will receive the line location of an event from calendarController. The contents of all lines prior are
     * copied to a temporary list. The temporary list is completed based on the original list and is used to overwrite the
     * original list.
     * 
     * @param int [id]    - the position of the event on the list - line number of the unwanted event + 1
     * 
     * @author Kalob Morel
     * @since 3/23/2021
     */
    public void deleteEvent(int id)
    {

    }

    public void editEvent()
    {
    }

    /**
     * This method will read a list of eventts and write an xml file for use in an HTML file.
     */
    public void makeList()
    {
        
    }

    
}