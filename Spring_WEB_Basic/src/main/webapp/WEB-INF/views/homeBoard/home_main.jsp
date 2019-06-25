<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <h1>현재 사용자 정보 : ${userName}</h1>  -->

<!-- 공지사항 게시판  -->
<div class="container-fluid">
	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="/">메인 페이지</a></li>
		<li class="breadcrumb-item active">Overview</li>
	</ol>
	<!-- DataTables Example -->
	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> 공지 사항
		</div>
	</div>
	
	<div class="card-body">
		<div class="table-responsive">
			<table class="table table-bordered" width="100%" cellspacing="0">
				<thead align="center">
						<tr>
							<th>번호</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성날짜</th>
						</tr>
				</thead>
				
				<tbody>
					<c:forEach items = "${homeboard}" var="homeboard">
						<tr>
							<td width="10%" align="center"> ${homeboard.id} </td>
							<td width="50%" align="left"><a href="home_boardRead"> ${homeboard.title} </a></td>
							<td width="10%" align="center"> ${homeboard.user_id} </td>
							<td width="30%" align="center"> ${homeboard.write_date} </td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
	</div>

</div>



