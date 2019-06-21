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
	
	//�α��� ���� UserDetail ������ ���� ���� �ȵǴ� Method
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String member_login(@ModelAttribute loginVO loginvo){
		System.out.println("member_login ���� ����");
		ms.loadUserByUsername(loginvo.getUser_id());
		
		return "/";
	}
	
	//ȸ������ - ������ ����
	@RequestMapping(value = "/memberJoin")
	public String member_Join(){
		System.out.println("ȸ������ ������ ����");		
		return "logInfo/memberJoin";
	}
	
	//ȸ������ - ȸ�� ��� �޼���
	@RequestMapping(value = "/memberJoin/register", method = RequestMethod.POST)
	public String memberJoinRegister(@ModelAttribute loginVO loginvo){
		//ȸ�� ��й�ȣ bcrypt ��ȣȭ
		loginvo.setUser_pw(BCrypt.hashpw(loginvo.getPassword(), BCrypt.gensalt(10)));		
		
		//������
		if(ms.memberRegisterService(loginvo)){
			System.out.println("ȸ�� ���� �Ϸ�");
			return "redirect:/login";
		}
		else{
			System.out.println("�α��� ����-���̵� �ߺ�");
			return "redirect:/memberJoin";
		}
	}
	
	
	
	//�α׾ƿ� �޼��� �ۼ��� �ʿ� ����
	/*
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(){
		System.out.println("�α׾ƿ� ������ ����");		
		return "logInfo/login";
	}*/

}
