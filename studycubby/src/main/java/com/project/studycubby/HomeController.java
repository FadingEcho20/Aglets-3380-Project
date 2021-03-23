package com.project.studycubby;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController 
{

	//A collection of controller methods that allow the menu to send views for the main application features to the user
	//Developed by: LaSean S.
	@RequestMapping("/")
	public String home() {
		return "Home Page example";
	}

	@RequestMapping("/Home Page example")
	public String returnHome() {
		return "Home Page example";
	}

	@RequestMapping("/SessionTypeSelection")
	public String sessionTypeSelection() {
		return "SessionTypeSelection";
	}

	@RequestMapping("/CalendarPage")
	public String calendar() {
		return "CalendarPage";
	}

	@RequestMapping("/Notespage")
	public String notes() {
		return "Notespage";
	}

}