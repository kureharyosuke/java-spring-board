package com.example.board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.board1.dto.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public ModelAndView loginPage(ModelAndView mv) {
		
		mv.setViewName("login");
		
		return mv;
	}
	@PostMapping("/login")
	public ModelAndView doLogin(ModelAndView mv, User user) {
		
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		
		return mv;
	}
	
}