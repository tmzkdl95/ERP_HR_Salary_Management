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

	@Inject
	private loginDAO logindao;
	
	//ȸ�� ���� ���
	public void memberRegisterService(loginVO loginvo){
		System.out.println("memberRegisterService ����");
		logindao.memberRegisterDAO(loginvo);
	}
	
	//UserDetailService ����ü - �α��� ���
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername ����");
		loginVO user = (loginVO) logindao.memberConfirm(username);
		
		if(user==null) {
		       throw new UsernameNotFoundException(username);
		}
	    return user;
	}

}
