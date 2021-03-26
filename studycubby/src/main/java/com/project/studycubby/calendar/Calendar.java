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
        File tmpList = new File("D:\\Aglets\\tmpList.txt");

        //compare date loop to find insert location - if date is same, compare time
        reader.nextLine();

        String curDate = reader.next();
        int lineNum = 2;
        int curTime;
        System.out.println("time = " + time);

        while(reader.hasNext())
        {
            if(curDate.compareTo(date) < 0)
            {
                lineNum ++;
                reader.nextLine();
                curDate = reader.next();
            }
            else if(curDate.compareTo(date) > 0)
            {
                break;
            }
            else
            {
                System.out.println("compared 0");

                curTime = reader.nextInt();
                System.out.println("curTime = " + curTime);
                if(curTime < time)
                {
                    lineNum++;
                }

                //check if event is duplicate. if duplicate, terminate. otherwise, continue insertion
                if(curTime == time)
                {
                    System.out.println("Same time");
                    if(reader.next().compareTo(name) == 0)
                    {
                        System.out.println("Same name");
                        if(reader.next().compareTo(desc) == 0)
                        {
                            reader.close();
                            System.out.println("same desc...returning...");
                            return;
                        }
                    }
                }

                System.out.println("comes out of the loop");
                break;
            }
        }
        reader.close();

        //copy from original list to tmpList
        Scanner copier1 = new Scanner(Events);

        try
        {
            FileWriter tmpWriter = new FileWriter("D:\\Aglets\\tmpList.txt");
            for(int i = 1; i < lineNum; i++)
            {
             tmpWriter.write(copier1.nextLine() + "\n");
            }

            //write new event
            tmpWriter.write(date + "    " + time + "    " + name + "   " + desc + "\n");

            //continue copying original list from line: (linenum + 1)
            while(copier1.hasNext())
            {
             tmpWriter.write(copier1.nextLine() + "\n");
            }

            tmpWriter.close();
        }
        catch(IOException e)
        {
            System.out.println("an error occurred");
        }

        copier1.close();

        //overwrite original list with tmpList
        Scanner copier2 = new Scanner(tmpList);

        try
        {
            FileWriter finalWriter = new FileWriter("D:\\Aglets\\Events.txt");

            while(copier2.hasNext())
            {
                finalWriter.write(copier2.nextLine() + "\n");
            }

            finalWriter.close();
        }
        catch(IOException e)
        {
            System.out.println("an error occurred");
        }
        
        copier2.close();
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