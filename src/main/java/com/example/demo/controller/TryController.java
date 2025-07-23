package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class TryController {
     @GetMapping("/get")
	 public String we() {
		 return "welcome to first deployement";
	 }
	 
}
