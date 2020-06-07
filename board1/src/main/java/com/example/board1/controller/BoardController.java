package com.example.board1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.board1.dto.BoardDTO;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/write")
	public ModelAndView writePage(ModelAndView mv) {
		
		mv.setViewName("write");
		
		return mv;
	}
	
	@PostMapping("/write")
	public ModelAndView doWrite(ModelAndView mv, BoardDTO board) {
		
		System.out.println("title: " + board.getTitle());
		System.out.println("contents: " + board.getContents());
		mv.setViewName("index");
		
		return mv;
	}
 	
}
