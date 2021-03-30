/**
 * This is an interface to ensure that components which use it
 * have the necessary methods to communicate with the server.
 * 
 * @author Kalob Morel
 * @since 3/29/2021
 */
package com.project.studycubby.calendar;

import java.io.FileNotFoundException;

public interface calendarInterface 
{
    public void createEvent(String date, String time, String name, String desc) throws FileNotFoundException;
    public void deleteEvent(int id) throws FileNotFoundException;
    public void editEvent(int id, String date, String time, String name, String desc) throws FileNotFoundException;
}
