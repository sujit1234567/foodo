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
List<Customer> custlist=new ArrayList<Customer>();
custlist=(List<Customer>)session.getAttribute("clist");
%>

<form>

<table border=1 cellspacing=0>
   <tr>
<td>Customerid</td>
<td>Customername</td>
<td>Customeremail</td>
<td>Customerpassword</td>
<td>Customercontact</td>
<td>Customeraddress</td>


<td colspan=2><center>Action</center></td>

</tr>

<% for(Customer c:custlist)
{
%>

<tr>
<td><%= c.getCustid()%></td>
<td><%= c.getCustname() %></td>
<td><%= c.getCustemail() %></td>
<td><%= c.getCustpassword() %></td>
<td><%= c.getCustcontact() %></td>
<td><%= c.getCustaddress() %></td>



<!--  <td><a href="CustomerServlet?action=update&id=<%=c.getCustid()%>">update</a></td>-->
<td><a href="CustomerServlet?action=update&id=<%=c.getCustid() %>">update</a></td>
<td><a href="CustomerServlet?action=delete&id=<%=c.getCustid() %>">delete</a></td>
</tr>
   
   
   
   <%} %>
</table>

</form>

</body>
</html>