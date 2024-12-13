package com.spring.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {	
	
	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("inside about handler");
		 model.addAttribute("name","Reetesh");
		 model.addAttribute("date", new Date().toString());
		
		
		return "about.html"; // about.html
	}

	@GetMapping("/iterate-loop")
	public String iteratehandler(Model model) {
		
		List<String> names = List.of("rahul","mahish","pankaj","mukesh");
		model.addAttribute("names",names);
		
		
		return "iterate.html";
	}
	
	@GetMapping("/conditional")
	public String conditionalHandler(Model model) {
		
		System.out.println("conditional handler");
		
		model.addAttribute("isActive",true);
		model.addAttribute("gender","F");

		List<Integer> list = List.of(10,20,30,410);
		
		model.addAttribute("myList",list);
		
		return "Conditional.html";
	}
	
	@GetMapping("/service")
	public String serviceHandler(Model model) {
		
		System.out.println("this is service handler");
		model.addAttribute("title", "this is for good samosa");
		model.addAttribute("subtitle", new Date().toString());
		
		return "Service.html";
	}
	
	@GetMapping("/newabout")
	public String newAbout() {
		System.out.println("this is new about");
		return "aboutnew.html";
	}
}
