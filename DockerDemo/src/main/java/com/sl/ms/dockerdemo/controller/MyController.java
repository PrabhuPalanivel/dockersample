package com.sl.ms.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/test-docker")
	public String getdata()
	{
		return "in docker demo project" ;
	}

}
