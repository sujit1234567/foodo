<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="CustomerServlet" method="post">
<input type="hidden" name="action" value="add">

<center>
<fieldset>
<legend>Add Customer</legend>


<table>


<tr>
<td>Customer Name :</td>
<td><input type="text" placeholder="enter the your name"  name="custname"></td>

</tr>
<tr>
<td>Customer Email :</td>
<td><input type="text" placeholder="enter the your email" name="custemail"></td>
</tr>
<tr>
<td>Customer Password:</td>
<td><input type="password" placeholder="enter the your password" name="custpassword"></td>

</tr>
<tr>
<td>Customer Contact:</td>
<td><input type="text" placeholder="enter the contact number" name="custcontact"></td>

</tr>
<tr>
<td>Customer Address :</td>
<td><input type="text" placeholder="enter the your address" name="custaddress"></td>

</tr>

<tr>
<td><input type="submit" value="submit" ></td>

<td><input type="submit" value="reset" ></td>
</tr>

</fieldset>



</table>





</center>

</form>

</body>
</html>