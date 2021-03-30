/**
 * This is a controller to manage the java program with the Spring Boot API.
 * 
 * @author Kalob morel
 * @since 3/29/2021
 */
package com.project.studycubby.calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.io.*;
/**
 * Controller to interact with the Spring Boot ApI
 */
@Controller
public class calendarController 
{
    /**
     * This method displays the the calendar up to the five most recent events.
     * The method calls the getList() method from Calendar.java to pass event information.
     * 
     * @param model [Model]    - the model component of the model-view-controller
     * @return
     * @throws FileNotFoundException
     * @author Kalob Morel
     * @since 3/29/2021
     */
    @RequestMapping("/Calendar")
    public String drawCalendar(Model model) throws FileNotFoundException
    {
        Calendar calendar = new Calendar();
        Event[] eventList = calendar.getList();

        model.addAttribute("calendar", calendar);
        model.addAttribute("eventList", eventList);

        return "CalendarPage";
    }

    /**
     * This method takes information from the website and converts the information 
     * into an object of type, Event. This object is then parsed and used to 
     * call createEvent() method from Calendar.java. The website is then updated
     * and returned to the calendar page.
     * 
     * 
     * @param event [Event]     - new event object crated by the user through studycubby
     * @param model [Model]     - the model component of hte model-view-controller
     * @return CalendarPage     - html reference
     * @throws FileNotFoundException
     * @author Kalob Morel
     * @since 3/29/2021
     */
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

    /**
     * This method allows the website to create an object, called event.
     * This new object is of type, Event.
     * 
     * @param model
     * @return CreateEvent  - html reference
     * @author Kalob Morel
     * @since 3/29/2021
     */
    @GetMapping("/Create Event")
    public String createEvent(Model model)
    {
        model.addAttribute("event" , new Event());
        return "CreateEvent";
    }
    

}
