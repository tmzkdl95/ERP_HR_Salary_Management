package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeBoardController {
	
	@RequestMapping(value="home_main")
	public String home_main(){
		
		
		return "homeBoard/home_main";
	}
	
	//공지사항 게시판 글쓰기 입장 -> admin만 입장 가능
	@RequestMapping(value="home_boardWrite")
	public String home_boardWrite(){
		
		
		return "homeBoard/home_boardWrite";
	}
	
	
	@RequestMapping(value="home_boardRead")
	public String home_boardRead(){
		
		
		return "homeBoard/home_boardRead";
	}
	

}
