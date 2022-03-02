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

Food f=(Food)session.getAttribute("food");
%>

<form action="foodservlet" method="post">
<input type="hidden" name="action" value="update">
<center>
<filedset>
<legend>Update Food</legend>

<tbody><tr>
            <td> Food Id: </td><td><input type="text" name="foodid" value= <%=f.getFoodid()%> ></td>
         </tr><tr>
         </tr><tr>
            <td> Food Name: </td><td><input type="text" name="foodname" value= <%=f.getFoodname()%>></td>
         </tr><tr>
         </tr><tr>
            <td> Food Type: </td>
                <td><input type="text" name="foodtype" value= <%=f.getFoodtype()%>></td>
                    
         </tr><tr>
         </tr><tr>
            <td> Food Category: </td><td><input type="text" name="foodcategory" value= <%=f.getFoodcategory()%>></td>
         </tr><tr>
         </tr><tr>
            <td> Food Image: </td><td><input type="text" name="foodimage" value= <%=f.getFoodimage()%>></td>
         </tr><tr>
         </tr><tr>
            <td> Food Description: </td><td><input type="text" name="fooddescription" value= <%=f.getFooddescription()%>></td>
         </tr><tr>
         </tr><tr>
            <td> Food Price: </td><td><input type="text" name="foodprice" value= <%=f.getFoodprice()%>></td>
         </tr><tr>
         </tr><tr>
            <td><input type="submit" value="Update Food"></td>
            <td><input type="reset" value="Reset"></td> 
         </tr>   
      </tbody>


</filedset>
</center>
</form>
</body>
</html>