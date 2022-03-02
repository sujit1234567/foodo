<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="java.util.ArrayList" %>
     <%@page import="java.util.List" %>
     <%@page import="com.food.pojo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="CustomerServlet" method="post">
<input type="hidden" name="action" value="update">

<% 

         Customer c=(Customer)session.getAttribute("custid");

%>
<center>
<filedset>
<legend>Customer Update</legend>

<table>

<tr>
<td>Customer Id :</td>
<td><input type="text" placeholder="enter the your Id"  name="custid" value= <%=c.getCustid()%>></td>
</tr>
<tr>
<td>Customer Name :</td>
<td><input type="text" placeholder="enter the your name"  name="custname" value= <%=c.getCustname()%>></td>

</tr>
<tr>
<td>Customer Email :</td>
<td><input type="text" placeholder="enter the your email" name="custemail" value= <%=c.getCustemail()%>></td>
</tr>
<tr>
<td>Customer Password:</td>
<td><input type="text" placeholder="enter the your password" name="custpassword" value= <%=c.getCustpassword()%>></td>

</tr>
<tr>
<td>Customer Contact:</td>
<td><input type="text" placeholder="enter the contact number" name="custcontact" value= <%=c.getCustcontact()%>></td>

</tr>
<tr>
<td>Customer Address :</td>
<td><input type="text" placeholder="enter the your address" name="custaddress" value= <%=c.getCustaddress()%>></td>

</tr>

<tr>
<td><input type="submit" value="submit" ></td>

<td><input type="submit" value="reset" ></td>
</tr>

</table>





</filedset>
</center>
</form>

</body>
</html>