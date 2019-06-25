<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <h1>현재 사용자 정보 : ${userName}</h1>  -->

<!-- 공지사항 게시판  -->
<div class="container-fluid">
	<!-- Breadcrumbs-->
	<p></p>
	<!-- DataTables Example -->
	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> 공지 사항
		</div>
	</div>
	
	<div class="card-body">
		<div class="list">
			목록 이동
		</div>
		<div class="table-responsive">
			<table class="table table-bordered" width="100%" cellspacing="0">
				
						<tr>
							<td width="10%">번호 : </td>
							<td width="70%">제목 : </td>
							<td width="20%">작성자 : </td>
						</tr>
						<tr>
							<td colspan="3" height="300">
							내용						
							</td>
						</tr>
						<tr>
							<td colspan="3" height="100">댓글 : </td>
						</tr>
				
			</table>
		</div>
		
	</div>

</div>



