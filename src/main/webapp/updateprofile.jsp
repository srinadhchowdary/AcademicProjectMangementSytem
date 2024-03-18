<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 

<html>
<head>

<link type="text/css" rel="stylesheet" href="css/style.css">

<style>

</style>
</head>
<body>

<%@ include file="facultynavbar.jsp" %>

<h3 align=right>Hi, ${fname}</h3>

<h3 align=center><u>Update Profile</u></h3>

<form method="post" action="updateprofile">

<table align=center>

<tr>
<td><label>Name</label></td>
<td>
<input type="text" name="name" required="required" value="${f.name}"/>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Gender</label></td>
<td>
${f.gender}
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Date of Birth</label></td>
<td>
<input type="date" name="dob" required="required"  value="${f.dateofbirth}"   />
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Department</label></td>
<td>
<select name="dept" required>
<option value="${f.department}" selected>${f.department}</option>
<option value="CSE Honours">CSEH</option>
<option value="CSERegular">CSER</option>
<option value="BCA">BCA</option>
<option value="OTHERS">Others</option>
</select>
</td>
</tr>

<tr><td></td></tr>


<tr>
<td><label>Salary</label></td>
<td><input type="number" name="salary" step="0.01" required  value="${f.salary}"    /></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Email ID</label></td>
<td><input type="email" name="email" required  value="${f.email}" readonly/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="pwd" required  value="${f.password}" /></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Location</label></td>
<td><input type="text" name="location" required value="${f.location}"/></td>
</tr>

<tr><td></td></tr>


<tr>
<td><label>Contact No</label></td>
<td><input type="text" name="contact" required value="${f.contact}" /></td>
</tr>

<tr><td></td></tr>
<tr><td></td></tr>

<tr align=center>
<td colspan=2><input type="submit" value="Update" class="button"></td>
</tr>

</table>

</form><%@ include file="footer.jsp" %>
<br><br><br><br><br><br><br><br><br><br><br><br><br>
<br><br><br><br><br>
</body>
</html>

