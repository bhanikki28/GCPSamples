package com.nikki.gcp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/appengine")
public class AppEngineController {
	
	@GetMapping("/display")
	public String display() {
		return "Welcome to AppEngine!";
		
	}
	
}
