package com.project.studycubby.calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.io.*;

@Controller
public class calendarController 
{
    @RequestMapping("/Calendar")
    public String drawCalendar(Model model) throws FileNotFoundException
    {
        Calendar calendar = new Calendar();
        Event[] eventList = calendar.getList();

        model.addAttribute("calendar", calendar);
        model.addAttribute("eventList", eventList);

        return "CalendarPage";
    }

    @PostMapping("/Create Event")
    public String getCalendar(@ModelAttribute Event event, Model model) throws FileNotFoundException
    {
        Calendar calendar = new Calendar();
        calendar.createEvent(event.date, event.time, event.name, event.desc);
        Event[] eventList = calendar.getList();

        
        model.addAttribute("calendar", calendar);
        model.addAttribute("eventList", eventList);

        return "CalendarPage";
    }

    @GetMapping("/Create Event")
    public String createEvent(Model model)
    {
        model.addAttribute("event" , new Event());
        return "CreateEvent";
    }
    

}
