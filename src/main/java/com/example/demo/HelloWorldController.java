package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@ShowAPI
public class HelloWorldController {
	
	@GetMapping("/say")
	public String sayHello() {
		return "hello";
	}
}
