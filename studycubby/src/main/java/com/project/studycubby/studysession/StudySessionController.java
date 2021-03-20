package com.project.studycubby.studysession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudySessionController {

	static final String SESSIONSTART = "SessionStart";

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

	@RequestMapping("/SessionStart-10")
	public String startSession10() {
		new MiniSession(10);
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
