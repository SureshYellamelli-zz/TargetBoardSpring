package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value = "addGoal", method = RequestMethod.GET)	
	public String addGoal(Model model) {
		model.addAttribute("goal", new Goal());
		return "addGoal";
	}
	@RequestMapping(value = "addGoal", method = RequestMethod.POST)	
    public String updateGoal(@ModelAttribute("goal") Goal goal) {
		
		System.out.println("Goal minutes: "+goal.getMinutes());
		return "redirect:addMinutes.html ";
	}  

}