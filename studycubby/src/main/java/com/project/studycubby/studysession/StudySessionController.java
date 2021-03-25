package com.project.studycubby.studysession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.io.*;

@Controller
public class StudySessionController {

	static final String SESSIONSTART = "SessionStart";

	//Controller methods to send the session time selection views to the user
	//Developed by: LaSean S.
	@RequestMapping("/DeepSessionTimes")
	public String deepSessionTimeSelection() {
		return "DeepSessionTimes";
	}
	
	@RequestMapping("/MiniSessionTimes")
	public String miniSessionTimeSelection() {
		return "MiniSessionTimes";
	}

	@RequestMapping("/SessionStart")
	public String startSession() {
		return SESSIONSTART;
	}

	//A collection of controller methods that create an associated study session, and send healthful tips for the user to view
	//Developed by: LaSean S.
	@RequestMapping("/SessionStart-10")
	public String startSession10(Model model) throws IOException {

		MiniSession session = new MiniSession(10);
		Tips tips = new Tips();
		
		model.addAttribute("tips", tips);
		model.addAttribute("session", session);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-20")
	public String startSession20(Model model) throws IOException {

		new MiniSession(20);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-45")
	public String startSession45(Model model) throws IOException {

		new MiniSession(45);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-50")
	public String startSession50(Model model) throws IOException {

		new DeepSession(50);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-110")
	public String startSession110(Model model) throws IOException {

		new DeepSession(110);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-170")
	public String startSession170(Model model) throws IOException {

		new DeepSession(170);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-230")
	public String startSession230(Model model) throws IOException {

		new DeepSession(230);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	//A controller method that sends the break screen view to the user
	//Developed by: LaSean S.
	@RequestMapping("/BreakScreen")
	public String startBreak(Model model) throws IOException {

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return "BreakScreen";
	}


}
