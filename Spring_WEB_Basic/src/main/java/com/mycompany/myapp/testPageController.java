package com.mycompany.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.mapper.testPageMapper;
import com.mycompany.vo.testPage;

@Controller
public class testPageController {
	
	@Autowired
	private testPageMapper testpagemapper;
	
	@RequestMapping(value = "/testPage", method = RequestMethod.GET)
	
	//DB ��� ���� �޼���
	public String testPage_print(Model model){
		//<> �ȿ� DTO or VO �̸�
		List<testPage> testpage = testpagemapper.getList_testpage();
		
		//model�� ���� View�� ����
		model.addAttribute("testpage",testpage);
		
		return "testPage/testpage";
	}
	

}
