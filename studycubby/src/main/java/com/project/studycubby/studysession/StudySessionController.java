package com.project.studycubby.studysession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/StudySession")
public class StudySessionController {

    @GetMapping
	public String createUserSession() {
        new MiniSession(45);
		return "A study session has been created.";
	}
    
}
