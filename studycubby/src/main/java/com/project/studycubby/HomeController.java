package com.project.studycubby;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

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
