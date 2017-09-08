package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pluralsight.model.Exercise;

@Controller
public class HelloController {

	@RequestMapping(value ="/greeting")
	public String sayHello (@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("In greeting Minutes: "+exercise.getMinutes());
		
		return "addMinutes";
	}
	
	@RequestMapping(value ="/addMinutes")
	public String addMinutes (@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("In Add Minutes: "+exercise.getMinutes());
		
		return "forward:addMoreMinutes.html";
	}
	
	
	@RequestMapping(value ="/addMoreMinutes")
	public String addMoreMinutes (@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("In Add More Minutes: "+exercise.getMinutes());
		
		return "addMinutes";
	}
}
