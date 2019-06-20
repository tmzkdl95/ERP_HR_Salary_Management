package com.mycompany.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.security.web.authentication.*;

import com.mycompany.service.memberService.member_Service;
import com.mycompany.vo.loginVO;
import com.mycompany.vo.testPage;


//ȸ�� ���� ��Ʈ�ѷ� �α׾ƿ� / ȸ������
@Controller
public class memberController {
	
	//���� ��ü ����
	@Autowired
	private member_Service ms;
	//Bcrypt ��ȣȭ ��ü ����
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	
	//�α��� ������ ���� defualt = get ���
	@RequestMapping(value = "/login")
	public String loginpage(){
		return "logInfo/login";
	}
	
	//�α��� ����
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String member_login(@ModelAttribute loginVO loginvo){
		System.out.println("member_login ���� ����");
		ms.loadUserByUsername(loginvo.getUser_id());
		
		return "/";
	}
	
	//ȸ������ ������ ����
	@RequestMapping(value = "/memberJoin")
	public String member_Join(){
		System.out.println("ȸ������ ������ ����");		
		return "logInfo/memberJoin";
	}
	
	//ȸ�� ��� �޼���
	@RequestMapping(value = "/memberJoin/register", method = RequestMethod.POST)
	public String memberJoinRegister(@ModelAttribute loginVO loginvo){
		//bcrypt ��ȣȭ
		loginvo.setUser_pw(BCrypt.hashpw(loginvo.getPassword(), BCrypt.gensalt(10)));		
		
		ms.memberRegisterService(loginvo);
		return "redirect:/login";
	}
	
	//�α׾ƿ� �޼���
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(){
		System.out.println("�α׾ƿ� ������ ����");		
		return "logInfo/login";
	}

}
