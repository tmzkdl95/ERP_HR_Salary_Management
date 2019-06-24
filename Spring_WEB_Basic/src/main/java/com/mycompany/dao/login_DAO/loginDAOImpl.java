package com.mycompany.dao.login_DAO;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.mycompany.vo.loginVO;

@Repository("loginDAOImpl")
public class loginDAOImpl implements loginDAO{
	
	@Inject
	private SqlSession sqlsession;
	
	private static final String NameSpace = "com.mycompany.mapper.mapper_XML";
	//private loginVO loginvo;
	
	@Override
	public loginVO memberConfirm(String user_id) throws SQLException{
		
		return sqlsession.selectOne(NameSpace+".select_userInfo",user_id);
	}
	
	//ȸ�� ���� - ȸ�� ���
	@Override
	public void memberRegisterDAO(loginVO login) throws SQLException{
		//insert���� return���� ����.
		try{
			sqlsession.insert(NameSpace+".insert_memberJoin",login);
			sqlsession.insert(NameSpace+".insert_mamberJoin_authority",login);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//ȸ�� ���� - id �ߺ� üũ
	@Override
	public String idCheckDAO(String user_id) throws SQLException {
		loginVO idCheck = sqlsession.selectOne(NameSpace+".idCheck",user_id);
		System.out.println("idCheck >>>>>>>>>>>"+idCheck);
		if(idCheck == null){
			return "null";
		}
		else{
			return idCheck.getUser_id();
		}
	}
	
	

}
