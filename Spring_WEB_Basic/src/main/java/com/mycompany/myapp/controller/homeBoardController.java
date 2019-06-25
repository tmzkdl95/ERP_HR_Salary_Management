package com.mycompany.myapp.controller;

import java.security.Principal;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.mapper.mapper_interface.homePageMapper;
import com.mycompany.vo.boardVO;

@Controller
public class homeBoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(homeBoardController.class);
	
	@Autowired
	private homePageMapper hm;
	
	//home - �������� ���
	@RequestMapping(value="home_main")
	public String home_main(Locale locale, Model model, Principal principal){
		logger.info("Welcome home! The client locale is {}.", locale);
		String userName = "";
		
		try{
			userName = principal.getName();
		}catch(NullPointerException e){
			userName = "����� ������ �����ϴ�.";
			//e.printStackTrace();
		}finally{
			System.out.println("userName >>>>" + userName);
			List<boardVO> homeboard = hm.getList_homeboard();
			model.addAttribute("homeboard",homeboard);
			model.addAttribute("userName",userName);
		}
		
		return "homeBoard/home_main";
	}
	
	//�������� �Խ��� �۾��� ���� -> admin�� ���� ����
	@RequestMapping(value="home_boardWrite")
	public String home_boardWrite(){
		
		
		return "homeBoard/home_boardWrite";
	}
	
	
	//�������� ���� �б� 
	@RequestMapping(value="home_boardRead")
	public String home_boardRead(){
		
		
		return "homeBoard/home_boardRead";
	}
	

}
