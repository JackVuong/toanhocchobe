<%@page import="controller.define"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ket Thuc</title>
<link rel="stylesheet" href="hoctoanchobe.css" />
</head>
<body background="img/background3.gif">
<script type = "text/javascript">

</script>
<%
	switch(define.point)
	{
	case 0:
		out.write("<img src='img/0diem.png' style ='width:1350px;height:600px'>");
		break;
	case 1:
		out.write("<img src='img/1diem.png' style ='width:1350px;height:600px'>");
		break;
	case 2:
		out.write("<img src='img/2diem.png' style ='width:1350px;height:600px'>");
		break;
	case 3:
		out.write("<img src='img/3diem.jpg' style ='width:1350px;height:600px'>");
		break;
	case 4:
		out.write("<img src='img/4diem.png' style ='width:1350px;height:600px'>");
		break;
	case 5:
		out.write("<img src='img/5diem.png' style ='width:1350px;height:600px'>");
		break;
	case 6:
		out.write("<img src='img/6diem.png' style ='width:1350px;height:600px'>");
		break;
	case 7:
		out.write("<img src='img/7diem.png' style ='width:1350px;height:600px'>");
		break;
	case 8:
		out.write("<img src='img/8diem.png' style ='width:1350px;height:600px'>");
		break;
	case 9:
		out.write("<img src='img/9diem.png' style ='width:1350px;height:600px'>");
		break;
	case 10:
		out.write("<img src='img/10diem.png' style ='width:1350px;height:600px'>");
		break;
	}
	define.point = 0;
	define.countGame = 0;
%>
</body>
<div style="margin-top:-80px; margin-left: 800px; ">
<a href = "lambaithi2.jsp"><input type ="button" class="btnEffect" value = "Continue"/></a>
<a href = "index.jsp"><input type ="button" class="btnEffect" value = "Home Page"/></a>
</div>
</html>