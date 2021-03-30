/**
 * This is a class which implements a type of object that stores
 * data useful in keeping track of future events.
 * 
 * @author Kalob Morel
 * @since 3/29/2021
 */
package com.project.studycubby.calendar;

/**
 * This class declares an object of type, Event
 * 
 * @author Kalob Morel
 * @since 3/29/2021
 */
public class Event 
{
    public int day;
    public int month;
    public int year;
    public String time;
    public String name;
    public String desc;
    public String date;

    /**
     * This is an empty constructor to allow the use of this class by the
     * Spring Boot API.
     * 
     * @author Kalob Morel
     * @sicne 3/29/2021
     */
    public Event()
    {
    }

    /**
     * This is a constructor made to be used by the backend of the website.
     * It instantiates an object of type, Event for export to the 
     * Spring Boot API.
     * 
     * @param day [String]  - Numerical representaiton of the day of the month
     * @param month [String]    - Numerical representation of the month of the year
     * @param year [String]     - the year of the event
     * @param time [String]     - representation of the time on a 24 hour time scale
     * @param name [String]     - Name of the event
     * @param description [String] - dDescription of the event
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public Event(int day, int month, int year, String time, String name, String description)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.name = name;
        this.desc = description;        
    }

    /**
     * This is a constructor made to be used by the Spring Boot API
     * to return an object of type, Event from the website.
     *
     * @param date [String]     - representation of the date in mm/dd/yyyy format
     * @param time [String]     - representation of the time on a 24 hour time scale
     * @param name [String]     - Name of the event
     * @param description [String] - dDescription of the event
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public Event(String date, String time, String name, String description)
    {
        this.date = date;
        this.time = time;
        this.name = name;
        this.desc = description;
    }

    /**
     * This method returns the date of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     * 
     * @return date
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public String getDate()
    {
        return date;
    }

    /**
     * This method returns the time of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     * 
     * @return time
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public String getTime()
    {
        return time;
    }

    /**
     * This method returns the name of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     * 
     * @return name
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public String getName()
    {
        return name;
    }

    /**
     * This method returns the description of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     * 
     * @return desc
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * This method sets the date of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     *
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public void setDate(String date)
    {
        this.date = date;
    }

     /**
     * This method sets the time of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     *
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public void setTime(String time)
    {
        this.time = time;
    }

        /**
     * This method sets the name of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     *
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public void setName(String name)
    {
        this.name = name;
    }

        /**
     * This method sets the description of the event. The Spring
     * Boot API uses this method to perform the POST operation.
     *
     * @author Kalob Morel
     * @since 3/29/2021
     */
    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}
