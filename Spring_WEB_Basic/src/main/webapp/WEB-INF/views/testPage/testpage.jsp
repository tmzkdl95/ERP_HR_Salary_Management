<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
</body>
</html>
 -->

<div class="container-fluid">

	<!-- Breadcrumbs-->
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="#">testPage</a></li>
		<li class="breadcrumb-item active">Overview</li>
	</ol>

	<!-- DataTables Example -->
	<div class="card mb-3">
		<div class="card-header">
			<i class="fas fa-table"></i> testPage-data
		</div>
		<div class="card-body">
			<div class="table-responsive">

				<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
					<thead>
						<tr>
							<th>id</th>
							<th>user_name</th>
							<th>content</th>
						</tr>
					</thead>
						
					<tbody>
						<c:forEach items="${testpage}" var="testpage">
											<tr>
												<td>${testpage.id}</td>
												<td>${testpage.user_name}</td>
												<td>${testpage.content}</td>												
											</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


</div>