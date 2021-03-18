package com.project.studycubby.studysession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StudySessionController {

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
		return "SessionStart";
	}

	@RequestMapping("/BreakScreen")
	public String startBreak() {
		return "BreakScreen";
	}


}
