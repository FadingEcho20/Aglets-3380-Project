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
import java.io.FileWriter;
import java.util.*;

public class Calendar implements calendarInterface
{

    public Calendar()
    {
    }
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
        File Events = new File("D:\\Aglets\\Events.txt");
        Scanner reader = new Scanner(Events);

        //create file stream from tmpList.txt
        // File tmpList = new File("D:\\Aglets\\tmpList.txt");

        //compare date loop to find insert location - if date is same, compare time
        reader.nextLine();

        String curDate = reader.next();
        System.out.println("the first curDate = " + curDate);
        int lineNum = 2;

        while(reader.hasNext())
        {
            if(curDate.compareTo(date) < 0)
            {
                lineNum ++;
                reader.nextLine();
                curDate = reader.next();
                System.out.println("curDate = " + curDate); 
            }
            else if(curDate.compareTo(date) > 0)
            {
                break;
            }
            else
            {
                if(reader.nextInt() > time)
                {
                    break;
                }

                lineNum++;
            }
        }

        //copy from original list to tmpList
                
        try
        {
            reader.reset();
            System.out.println("after reset, reader says: " + reader.next());

            FileWriter writer = new FileWriter("tmpList.txt");
            for(int i = 1; i < lineNum; i++)
            {
             writer.write(reader.nextLine() + "\n");
            }

         writer.write(date + "    " + time + "    " + name + "    " + desc + "\n");

            while(reader.hasNext())
            {
             writer.write(reader.nextLine() + "\n");
            }

         writer.close();
        }
        catch(IOException e)
        {
            System.out.println("an error occurred");
        }
        
        
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
        System.out.println("list");
    }
}