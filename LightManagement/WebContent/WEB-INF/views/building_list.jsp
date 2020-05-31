<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Building manager</title>
</head>
<body>
<div align="center">
		<h1>Buildings list</h1>
		
		<table border="1" cellpadding="5">
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Description</th>
				<th>Status</th>	
				<th>Address</th>				
			</tr>
			
			<c:forEach items="${listBuilding}" var="building" varStatus="status">
			<tr>
				<td>${status.index + 1}</td>
				<td>${building.buildingName}</td>
				<td>${building.buildingDescription}</td>
				<td>${building.buildingStatus}</td>		
				<td>${building.buildingAddress}</td>		
				<td>
					<a href="edit_building?buildingId=${building.buildingId}">Edit</a>
					&nbsp;&nbsp;&nbsp;
					<a href="delete_building?buildingId=${building.buildingId}">Delete</a>
				</td>		
			</tr>
			</c:forEach>
		</table>
		
		
	</div>
</body>
</html>