<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>

<html>

<head>
	<title>List Employees</title>
	

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Employees</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<table>
				<tr>
					<th>Όνομα</th>
					<th>Επίθετο</th>
					<th>Θέση</th>
					<th>Μισθός</th>
					<th>Προμήθεια</th>
					<th>Ημ. πρόσληψης</th>
					<th>Τμήμα</th>
					<th>Manager</th>
				</tr>
				
				<!-- loop over and print our employees -->
				<c:forEach var="tempEmployee" items="${employees}">
				
					<tr>
						<td> ${tempEmployee.firstName} </td>
						<td> ${tempEmployee.lastName} </td>
						<td> ${tempEmployee.job} </td>
						<td> <fmt:formatNumber value= "${tempEmployee.salary}" type="number" pattern="###,###" /> </td>
						<td> <fmt:formatNumber value= "${tempEmployee.commission}" type="number" pattern="###,###"/> </td>
						<td> <fmt:formatDate value="${tempEmployee.hireDate}" pattern="dd/MM/yyyy"/> </td>
						<td> ${tempEmployee.department.departmentName} </td>
						<td> ${tempEmployee.manager.firstName} ${tempEmployee.manager.lastName} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				<a href="${pageContext.request.contextPath}/"> Home</a>
		</div>
	
	</div>
	

</body>

</html>



