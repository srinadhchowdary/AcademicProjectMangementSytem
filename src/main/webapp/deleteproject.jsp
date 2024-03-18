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
 
<h3 align="center"><u>Delete Project</u></h3> 
 
<table align=center  border=2>  
<tr bgcolor="black" style="color:white"> 
<td>ID</td> 
<td>NAME</td> 
<td>DESCRIPTION</td> 
<td>ACTION</td>
</tr> 
 
<c:forEach items="${projectdata}"  var="f"> 
<tr> 
<td><c:out value="${f.id}" /></td> 
<td><c:out value="${f.name}" /></td> 
<td><c:out value="${f.desc}" /></td> 


<td>
<a href='<c:url value="delete3/${f.id}"></c:url>'>Delete</a>
</td>
 
</tr> 
</c:forEach> 
 
</table> 
 
</body> 
</html>