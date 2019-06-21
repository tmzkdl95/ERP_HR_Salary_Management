package com.mycompany.service.memberService;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mycompany.dao.login_DAO.loginDAO;
import com.mycompany.vo.loginVO;


@Service
public class member_Service implements UserDetailsService {
		
	@Autowired
	private loginDAO logindao;
	//ȸ�� ���� ���
	public boolean memberRegisterService(loginVO loginvo){
		System.out.println("memberRegisterService ����");
		try{
			//id �ߺ��� ���� ���
			if(logindao.idCheckDAO(loginvo.getUser_id()).equals("null")){
				System.out.println("�ߺ� �ƴ�");
				logindao.memberRegisterDAO(loginvo);
				return true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername ���� / username = " + username );
		loginVO user = new loginVO();
		
		try{
			user = logindao.memberConfirm(username);
			user.setUser_authority("ROLE_USER");
		}catch(SQLException e){
			e.printStackTrace();
		}
		/*
		if(user==null) {
            throw new UsernameNotFoundException(username);
        }*/
		System.out.println("[head] user setting info >>>>>>>>>>>>>>>>>"+user);
	
		return user;
	}
}
