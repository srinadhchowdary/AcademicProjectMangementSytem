<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 

<html>
<head>

<link type="text/css" rel="stylesheet" href="css/style.css">

<style>

</style>
</head>
<body>

<%@ include file="studentnavbar.jsp" %>

<h3 align=right>Hi, ${sname}</h3>

<h3 align=center><u>Update Profile</u></h3>

<form method="post" action="studentupdateprofile">

<table align=center>

<tr>
<td><label>Name</label></td>
<td>
<input type="text" name="name" required="required" value="${s.name}"/>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Gender</label></td>
<td>
${s.gender}
</td>
</tr>


<tr><td></td></tr>

<tr>
<td><label>Email ID</label></td>
<td><input type="email" name="email" required  value="${s.email}"/></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="pwd" required  value="${s.password}" /></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Address</label></td>
<td><input type="text" name="address" required value="${s.address}"/></td>
</tr>

<tr><td></td></tr>


<tr>
<td><label>Contact No</label></td>
<td><input type="text" name="contact" required value="${s.contactno}" /></td>
</tr>

<tr><td></td></tr>
<tr><td></td></tr>

<tr align=center>
<td colspan=2><input type="submit" value="Update" class="button"></td>
</tr>

</table>

</form>

</body>
</html>

