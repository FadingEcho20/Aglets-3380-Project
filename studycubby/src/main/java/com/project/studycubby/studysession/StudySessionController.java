package com.project.studycubby.studysession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.io.*;

@Controller
public class StudySessionController {

	static final String SESSIONSTART = "SessionStart";
	//static final String DISPLAYTIPS = "DisplayTips";

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

	@RequestMapping(value="/SessionStart-10", method=RequestMethod.GET)
	public String startSession10(Model model) throws IOException {

		new MiniSession(10);

		Tips tips = new Tips();
		model.addAttribute("tips", tips);

		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-20")
	public String startSession20() {
		new MiniSession(20);
		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-45")
	public String startSession45() {
		new MiniSession(45);
		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-50")
	public String startSession50() {
		new DeepSession(50);
		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-110")
	public String startSession110() {
		new DeepSession(110);
		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-170")
	public String startSession170() {
		new DeepSession(170);
		return SESSIONSTART;
	}

	@RequestMapping("/SessionStart-230")
	public String startSession230() {
		new DeepSession(230);
		return SESSIONSTART;
	}

	@RequestMapping("/BreakScreen")
	public String startBreak() {
		return "BreakScreen";
	}


}
