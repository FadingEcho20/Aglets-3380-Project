package com.project.studycubby.calendar;

import java.io.FileNotFoundException;

public interface calendarInterface 
{
    public void createEvent(String date, int time, String name, String desc) throws FileNotFoundException;
    public void deleteEvent(int id) throws FileNotFoundException;
    public void editEvent() throws FileNotFoundException;
}
