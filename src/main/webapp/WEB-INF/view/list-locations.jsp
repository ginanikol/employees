<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>

<html>

<head>
	<title>List Locations</title>
	

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Locations</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
		
	
			<table>
				<tr>
					<th>Τοποθεσία</th>
					<th>Τμήματα</th>
				</tr>
				
				<c:forEach var="tempLocation" items="${locations}">
					<tr>
						<td> ${tempLocation.location} </td>
						
						<form action="processForm" method="GET">	
							<td> 
									<input type="hidden" name="locId" value="${tempLocation.id}"> 
									<input type="submit" value="Show departments"/> 
							</td>
						</form>
						
					</tr>
				</c:forEach>
						
			</table>
		
				
		</div>
	
	</div>
	<a href="${pageContext.request.contextPath}/"> Home</a>

</body>

</html>

