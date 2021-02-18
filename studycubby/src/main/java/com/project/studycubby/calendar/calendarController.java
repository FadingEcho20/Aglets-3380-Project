package com.project.studycubby.calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping(path = "api/v1/calendar")
public class calendarController 
{
    @GetMapping
    public String responseString()
    {
        Event event1 = new Event("Calendar component can return something");
        return event1.getName();
    }
}