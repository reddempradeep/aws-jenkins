package com.example.awsjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	
	
	
	
	@GetMapping("/aws-jenkins")
	public String test() {
		return "Hello ------ aws - jenkins";
	}

}
