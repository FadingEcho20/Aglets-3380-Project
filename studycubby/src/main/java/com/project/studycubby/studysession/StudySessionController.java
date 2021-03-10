package com.project.studycubby.studysession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
//@RequestMapping(path = "api/v1/StudySession")
public class StudySessionController {

    // @GetMapping
	// public String createUserSession() {
    //     new MiniSession(45);
	// 	return "A study session has been created.";
	// }

	@RequestMapping(value = "/Home Page example")
	public String index() {
		return "Home Page example";
	}
    
}
