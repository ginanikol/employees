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
			<h2> ${locName} </h2>
			
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
				<tr>
					<th>Τμήματα </th>
				</tr>
				
				<c:forEach var="tempDepartment" items="${theDepartments}">
					<tr>
						<td> ${tempDepartment.departmentName} </td>
					</tr>
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	<a href="${pageContext.request.contextPath}/location/list"> Back to locations</a> <br/>
	<a href="${pageContext.request.contextPath}/"> Home</a>
</body>

</html>

