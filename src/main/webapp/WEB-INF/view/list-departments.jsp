<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>

<html>

<head>
	<title>List Departments</title>
	
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Departments</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
				<tr>
					<th>Τμήμα</th>
					<th>Τοποθεσία</th>
					<th></th>
				</tr>
				
				<c:forEach var="tempDepartment" items="${departments}">
					<tr>
						<td> ${tempDepartment.departmentName} </td>
						<td> ${tempDepartment.location.location} </td>
			
						<form action="processForm" method="GET">
							<td>	
								 <input type="hidden" name="depId" value="${tempDepartment.id}"> 
									<input type="submit" value="Show employees"/> 
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

