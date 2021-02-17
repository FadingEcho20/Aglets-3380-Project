package com.project.studycubby.calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping(path = "api/v1/calendar")
public class calendarController 
{
    // public ArrayList<Event> list = new ArrayList<Event>();

    // Event event1 = new Event("Febuary 3, 2021");
    // Event event2 = new Event("March 6, 2021");

    // list.Add(event1);
    // list.Add(event2);

    // @GetMapping
    // return list;

    @GetMapping
    public String responseString()
    {
        return "Febuary 3, 2021";
    }
}