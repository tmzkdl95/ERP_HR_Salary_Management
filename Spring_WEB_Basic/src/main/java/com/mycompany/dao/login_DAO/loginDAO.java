package com.mycompany.dao.login_DAO;

import java.sql.SQLException;
import java.util.List;

import com.mycompany.vo.loginVO;

public interface loginDAO {
	
	//�α��� Ȯ��
	public List<loginVO> memberConfirm(String user_id);
	
	//ȸ������
	public void memberRegisterDAO(loginVO loginvo);


}
