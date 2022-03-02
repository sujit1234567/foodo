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

<%

List<Food> foodlist=new ArrayList<>();
foodlist=(List<Food>)session.getAttribute("flist");

String admin=(String)session.getAttribute("Admin");
String user=(String)session.getAttribute("User");

%>


<form>
<center>
<fieldset>
<legend>Food List</legend>


<table border=1 cellspacing=0>
<tr>
<td>foodid</td>
<td>foodname</td>
<td>foodtype</td>
<td>foodcategory</td>
<td>foodimage</td>
<td>fooddescreption</td>
<td>foodprice</td>



<td colspan=2><b>Action</b></td>





</tr>



<% for(Food f:foodlist)
{	
%>
<tr>
<td><%= f.getFoodid() %></td>
<td><%= f.getFoodname() %></td>
<td><%= f.getFoodtype() %></td>
<td><%= f.getFoodcategory() %></td>
<td><%= f.getFoodimage() %></td>
<td><%= f.getFooddescription() %></td>
<td><%= f.getFoodprice() %></td>


<td><a href="foodservlet?action=update&id=<%=f.getFoodid() %>">update</a></td>
<td><a href="foodservlet?action=delete&id=<%=f.getFoodid() %>">delete</a></td>

</tr>

<tr>

   <td><a href="CartServlet?action=addtoCart&id=<%=f.getFoodid() %>>"></a></td>
  
</tr>
<%} %>

</fieldset>
</table>
</center>

</form>


</body>
</html>