<%@page import="controller.define"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="database.*"%>
<%@page import="model.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Start</title>

<link rel="stylesheet" href="style.css" />
</head>
<script type = "text/javascript">
function h1click()
{
	document.getElementById("1").checked = true;
	document.getElementById("kq").value = 1;
	//ketquachon=1;
}
function h2click()
{
	document.getElementById("2").checked = true;
	document.getElementById("kq").value = 2;
	//ketquachon=2;
}
function h3click()
{
	document.getElementById("3").checked = true;
	document.getElementById("kq").value = 3;
	//ketquachon=3;
}
function h4click()
{
	document.getElementById("4").checked =true;
	document.getElementById("kq").value = 4;
	//ketquachon=4;
}
</script>
<body background="img/134.gif">
<%
	DbManager manager = new DbManager();
	manager.openConnection();
	List<CauHoi> ListCauHoi = manager.getDSCauHoi2("1");
%>
<form action="LenLevel" method="post">
<div id = "divbailam" style="width:1000px; height:650px; margin-left:160px" >
  <%
	  //String count =request.getParameter("count");
	  //int dem = Integer.parseInt(count);
	  /*int i = (int) session.getAttribute("i");
	  if(session.getAttribute("i") == null)
	  {
		  i = 0;
		  session.setAttribute("i", i);
	  }*/
	  int i = define.countGame;
	  out.write("<img src="+ListCauHoi.get(i).getCauHoi()+" id= 'imgcauhoi' style='width:1000px; height:300px'/>");
	  out.write("<div id = 'dapan' style='width:1000px; height:250px'>");
	  out.write("<img src="+ListCauHoi.get(i).getDapAn1()+" id='h1' style='width:200px; height:200px; padding:20px' onclick='h1click()'/>"); 
	  out.write("<img src="+ListCauHoi.get(i).getDapAn2()+" id='h2' style='width:200px; height:200px; padding:20px' onclick='h2click()'/>"); 
	  out.write("<img src="+ListCauHoi.get(i).getDapAn3()+" id='h3' style='width:200px; height:200px; padding:20px' onclick='h3click()'/>"); 
	  out.write("<img src="+ListCauHoi.get(i).getDapAn4()+" id='h4' style='width:200px; height:200px; padding:20px' onclick='h4click()'/>");
	  out.write("<div id = 'trloi' style='width:1000px; height:30px; margin-top:-30px'>");
	  out.write("<input type='radio' id ='1' name ='traloi' style='margin-left:110px' onclick='h1click()'/>");
	  out.write("<input type='radio' id ='2' name ='traloi' style='margin-left:220px' onclick='h2click()'/>");
	  out.write("<input type='radio' id ='3' name ='traloi' style='margin-left:220px' onclick='h3click()'/>");
	  out.write("<input type='radio' id ='4' name ='traloi' style='margin-left:220px' onclick='h4click()'/>");
	  out.write("<input type = 'hidden' id='kq' name = 'ketquachon' value = '0'/>");
	  out.write("</div>");
	  out.write("</div>");
	  out.write("<div id = 'nextdiv' style='width:99px; height:99px; margin-left:850px'>");
	  //out.write("<img src='img/next.png' name ='action' id ='nextimg' style='width:99px; height:99px' alt ='Submit'/>");
	  out.write("<input type ='submit' value='Next' id ='next' style='background-color:yellow' class='btnEffect' />");
	  out.write("</div>");
	  
  %>
</div>


</form>
</body>
</html>