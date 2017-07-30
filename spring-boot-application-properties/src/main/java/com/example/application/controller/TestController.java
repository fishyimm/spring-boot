package com.example.application.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${exampleMsg}")
	public String testMsg;
	
	@Value("${tempMsg}")
	public String tempMsg;
	
	@RequestMapping("/hello")
	public String hello() {
		return testMsg + " " + tempMsg;
	}
}
