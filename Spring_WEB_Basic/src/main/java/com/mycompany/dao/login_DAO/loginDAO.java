package com.mycompany.dao.login_DAO;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.vo.loginVO;

public interface loginDAO {
	
	//�α��� Ȯ��
	public loginVO memberConfirm(String user_id)throws SQLException;
	
	//ȸ������ - ȸ�� ���� ���
	public void memberRegisterDAO(loginVO loginvo) throws SQLException;
	
	//ȸ������ - id �ߺ� üũ
	public String idCheckDAO(String user_id) throws SQLException;


}
