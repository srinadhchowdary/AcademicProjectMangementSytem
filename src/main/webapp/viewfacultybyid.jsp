<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c1" %>
 
<html> 
<head> 
 
<link type="text/css" rel="stylesheet" href="css/style.css"> 
 
<style> 
 
 
</style> 
</head> 
<body> 


<%@ include file="adminnavbar.jsp" %>

ID : ${faculty.id}<br>
Name : ${faculty.name}<br>
Gender : ${faculty.gender}<br>
DateofBirth : ${faculty.dateofbirth}<br>
Department : ${faculty.department}<br>
Subjects : ${faculty.subjects}<br>
Experience : ${faculty.experience}<br>
Salary : ${faculty.salary}<br>
Email : ${faculty.email}<br>
Location : ${faculty.location}<br>
Contact No : ${faculty.contact}<br>
Status : ${faculty.active}

</body>
</html>