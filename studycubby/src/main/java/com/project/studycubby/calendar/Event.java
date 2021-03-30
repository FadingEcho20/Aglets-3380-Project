package com.project.studycubby.calendar;

public class Event 
{
    public int day;
    public int month;
    public int year;
    public String time;
    public String name;
    public String desc;
    public String date;


    public Event()
    {
    }

    public Event(int day, int month, int year, String time, String name, String description)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.name = name;
        this.desc = description;        
    }

    public Event(String date, String time, String name, String description)
    {
        this.date = date;
        this.time = time;
        this.name = name;
        this.desc = description;
    }

    public String getDate()
    {
        return date;
    }

    public String getTime()
    {
        return time;
    }

    public String getName()
    {
        return name;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }
}
