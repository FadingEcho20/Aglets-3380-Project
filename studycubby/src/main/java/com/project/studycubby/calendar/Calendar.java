package com.project.studycubby.calendar;

import java.util.ArrayList;

public class Calendar implements calendarInterface
{

    private ArrayList<Event> events;

    // implement a field for alerts
    /**
     * creates an entry to the calendar database with new id
     * fields are given in (MM,DD,YYY) - date, (HHMM) - time, and (Name, Description)
     */
    public void createEvent(Event newEntry)
    {
        events.add(newEntry);
    }

    /**
     * deletes entry with object id: id
     */
    public void deleteEvent(Event unwantedEvent)
    {
        events.remove(unwantedEvent);
    }

    /**
     * overwrites entry with object id: id
     */
    public void editEvent(Event targeEvent)
    {

    }

    public String printList()
    {
        String printString = "hi";
        

        return printString;
    }

}