<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ������</title>
</head>
<body>
		
		<form action = "memberJoin/register" method = "post" id = "userInfo">
						<!-- name�� vo�� ������ �̸��̶� �Ȱ��ƾ��� -->
			 ID : <input name="user_id" type="text" size="10" id="user_id">
		 	 Password : <input name="user_pw" type="text"size="10" id="user_pw">
		 	 Mail : <input name="user_mail" type="text"size="10" id="user_mail">
		
		<div class="form-group">
            <input type="hidden" name="${ _csrf.parameterName }" value="${ _csrf.token }" >
        </div> 
		 <input type = "submit">
		</form>
		
</body>
</html>