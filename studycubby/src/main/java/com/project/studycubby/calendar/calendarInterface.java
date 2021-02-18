package com.project.studycubby.calendar;

public interface calendarInterface 
{
    public void createEvent(Event newEntry);
    public void deleteEvent(Event unwantedEntry);
    public void editEvent(Event targetEntry);
}
