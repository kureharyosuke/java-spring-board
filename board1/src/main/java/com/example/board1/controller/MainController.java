package com.example.board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@GetMapping("/")
	public ModelAndView index(ModelAndView mv) {
		
		mv.setViewName("index");
		
		return  mv;
	}
}