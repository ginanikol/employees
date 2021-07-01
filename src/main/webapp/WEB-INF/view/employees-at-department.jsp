<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>

<html>

<head>
	<title></title>
	

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
		
		<div id="wrapper">
		<div id="header">
			<h2>${depName} </h2>
			
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
				<tr>
					<th>Υπάλληλοι </th>
				</tr>
				
				<c:forEach var="tempEmployees" items="${theEmployeesInDep}">
					<tr>
						<td> ${tempEmployees.firstName} ${tempEmployees.lastName} </td>
					</tr>
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	<a href="${pageContext.request.contextPath}/"> Home</a> <br/>
	<a href="${pageContext.request.contextPath}/department/list"> Back to departments</a>
</body>

</html>

