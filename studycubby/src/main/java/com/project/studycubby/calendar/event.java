package com.project.studycubby.calendar;

public class event 
{
    private int day;
    private int month;
    private int year;
    private int time;
    private String name;
    private String description;

    public event(int day, int month, int year, int time, String name, String description)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.time = time;
        this.name = name;
        this.description = description;
    }
}
