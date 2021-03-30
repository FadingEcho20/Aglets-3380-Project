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
     * empty constructor to allow the use of the methods in this class
     */
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
    public void createEvent(String date, String time, String name, String desc) throws FileNotFoundException
    {
        //create file stream from Events.txt
        File Events = new File("studycubby\\Events.txt");
        Scanner reader = new Scanner(Events).useDelimiter("//");

        //create file stream from tmpList.txt
        File tmpList = new File("studycubby\\tmpList.txt");

        //compare date loop to find insert location - if date is same, compare time
        reader.nextLine();
        String curDate;

        int lineNum = 2;
        String curTime;

        //parse date given
        Scanner dateParse = new Scanner(date).useDelimiter("\\s*/\\s*");
        int newMonth = dateParse.nextInt();
        int newDay = dateParse.nextInt();
        int newYear = dateParse.nextInt();
        dateParse.close();

        while(reader.hasNext())
        {
            curDate = reader.next();

            //parse date
            Scanner curDateParse = new Scanner(curDate).useDelimiter("\\s*/\\s*");
            int curMonth = curDateParse.nextInt();
            int curDay = curDateParse.nextInt();
            int curYear = curDateParse.nextInt();
            curDateParse.close();

            if(curYear < newYear)
            {
                lineNum ++;
                reader.nextLine();
            }

            else if(curYear > newYear)
            {
                break;
            }

            //check if event is duplicate. if duplicate, terminate. otherwise, continue insertion
            else
            {
                if(curMonth < newMonth)
                {
                    lineNum++;
                    reader.nextLine();
                }

                else if(curMonth > newMonth)
                {
                    break;
                }

                else
                {
                    if(curDay < newDay)
                    {
                        lineNum++;
                        reader.nextLine();
                    }

                    else
                    {
                        break;
                    }
                }
            }
        }
        reader.close();
        System.out.println("inserting event at line " + lineNum);

        //copy from original list to tmpList
        Scanner copier1 = new Scanner(Events);

        try
        {
            FileWriter tmpWriter = new FileWriter("studycubby\\tmpList.txt");
            for(int i = 1; i < lineNum; i++)
            {
             tmpWriter.write(copier1.nextLine() + "\n");
            }

            //write new event
            tmpWriter.write(date + "/    //" + time + "    //" + name + "   //" + desc + "//\n");

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
            FileWriter finalWriter = new FileWriter("studycubby\\Events.txt");

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
     * @throws FileNotFoundException
     * @since 3/23/2021
     */
    public void deleteEvent(int id) throws FileNotFoundException
    {
        //create file stream from Events.txt
        File Events = new File("studycubby\\Events.txt");

        //copy from original list to tmpList
        Scanner copier1 = new Scanner(Events);

        try
        {
            //copy original list until
            FileWriter tmpWriter = new FileWriter("studycubby\\tmpList.txt");
            for(int i = 1; i < id; i++)
            {
             tmpWriter.write(copier1.nextLine() + "\n");
            }

            //skip unwanted event
            copier1.nextLine();

            //continue copying original list from after id
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

        //create file stream from tmpList.txt
        File tmpList = new File("studycubby\\tmpList.txt");

        //overwrite original list with tmpList
        Scanner copier2 = new Scanner(tmpList);

        try
        {
            FileWriter finalWriter = new FileWriter("studycubby\\Events.txt");

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
     * This method will "edit" an existing event on a particular line. This method will delete the existing
     * event and replace it with another user defined attempt.
     * 
     * @throws FileNotFoundException
     * @param id [int]  - the line at which to delete the event
     * @param date [String]     - new date for the event to be added
     * @param time [int]     - new time for the event to be added
     * @param name [String]     - new name for the event to be added
     * @param desc [String]     - new description for the event to be added
     * @author Kalob Morel
     * @since 3/28/2021
     */
    public void editEvent(int id, String date, String time, String name, String desc) throws FileNotFoundException
    {
        deleteEvent(id);
        createEvent(date, time, name, desc);
    }

    /**
     * This method will read a list of events and export it for displaying on the website.
     * @throws FileNotFoundException
     */
    public Event[] getList() throws FileNotFoundException
    {
        Event[] eventObjectList = new Event[5];

        //create file stream from Events.txt
        File Events = new File("studycubby\\Events.txt");
        Scanner reader = new Scanner(Events).useDelimiter("//");
        reader.nextLine();

        String date;
        String time;
        String name;
        String desc;        

        for(int i = 0; i < eventObjectList.length; i++)
        {
            date = reader.next();

            Scanner dateParse = new Scanner(date).useDelimiter("\\s*/\\s*");
            int newMonth = dateParse.nextInt();
            int newDay = dateParse.nextInt();
            int newYear = dateParse.nextInt();
            dateParse.close();

            System.out.println("new month = " + newMonth);
            System.out.println("newday = " + newDay);
            System.out.println("new year = " + newYear);

            time = reader.next();
            System.out.println("time = " + time);
            name = reader.next();
            desc = reader.next();
            reader.nextLine();

            Event event = new Event(newDay, newMonth, newYear, time, name, desc);

            eventObjectList[i] = event;
        }

        reader.close();

        return eventObjectList;
    }
}