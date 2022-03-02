<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="foodservlet" method="POST">
<input type="hidden" name="action" value="add">
 

<center>
<fieldset>
<legend>Add Food</legend>

<table>

<tr>
<td>Food Name :</td>
<td><input type="text" placeholder="enter the food name"  name="foodname"></td>
</tr>

<tr>
<td>Food Type :</td>
<td><input type="text" placeholder="enter the food type" name="foodtype"></td>
</tr>
<tr>
<td>Food category :</td>
<td><input type="text" placeholder="enter the category" name="foodcategory"></td>

</tr>
<tr>
<td>Food Image :</td>
<td><input type="text" placeholder="enter the foodimage" name="foodimage"></td>

</tr>
<tr>
<td>Food Description :</td>
<td><input type="text" placeholder="enter the fooddescription" name="fooddescription"></td>

</tr>
<tr>
<td>Food Price :</td>
<td><input type="text" placeholder="enter the foodprice" name="foodprice"></td>
</tr>

<tr>
<td><input type="submit" value="submit" ></td>
<td><input type="submit" value="reset" ></td>
</tr>

</table>

</fieldset>
</center>

</form>

</body>
</html>