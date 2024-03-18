<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 
 
<html> 
<head> 
 
<link type="text/css" rel="stylesheet" href="css/style.css"> 
 
<style> 
 
 
</style> 
</head> 
<body> 
 
 <%@ include file="adminnavbar.jsp" %>
 
<br> 
 
<h3 align="center"><u>Delete Faculty</u></h3> 
 
<table align=center  border=2>  
<tr bgcolor="black" style="color:white"> 
<td>ID</td> 
<td>NAME</td> 
<td>DEPARTMENT</td> 
<td>LOCATION</td> 
<td>SUBJECTS</td> 
<td>EXPERIENCE</td> 
<td>EMAIL ID</td> 
<td>CONTACT NO</td> 
<td>ACTION</td>
</tr> 
 
<c:forEach items="${facultydata}"  var="f"> 
<tr> 
<td><c:out value="${f.id}" /></td> 
<td><c:out value="${f.name}" /></td> 
<td><c:out value="${f.department}" /></td> 
<td><c:out value="${f.location}" /></td> 
<td><c:out value="${f.subjects}" /></td> 
<td><c:out value="${f.experience}" /></td> 
<td><c:out value="${f.email}" /></td> 
<td><c:out value="${f.contact}" /></td> 

<td>
<a href='<c:url value="delete/${f.id}"></c:url>'>Delete</a>
</td>
 
</tr> 
</c:forEach> 
 
</table> 
 
</body> 
</html>