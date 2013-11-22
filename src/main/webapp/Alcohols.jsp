<%@page import="com.example.servletjspdemo.web.Alcohol.PojemnoscEnum"%>
<%@page import="com.example.servletjspdemo.web.Alcohol.RodzajEnum"%>
<%@page import="com.example.servletjspdemo.web.Alcohol.TypEnum"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alcohols</title>
</head>
<body bgcolor="#339933">
<h1>ALKOHOLE</h1>
<img src="http://www.alkohole.wortale.net/gal/alkohole-inne-alkohole-13239847630666.jpg" align="right" />
	<jsp:useBean id="typ" class="com.example.servletjspdemo.web.Alcohol"
		scope="session" />
	<jsp:useBean id="alko"
		class="com.example.servletjspdemo.web.Alcohol" scope="session" />
	<jsp:useBean id="rodzaj"
		class="com.example.servletjspdemo.web.Alcohol" scope="session" />
	<jsp:useBean id="pojemnosc"
		class="com.example.servletjspdemo.web.Alcohol" scope="session" />
	<jsp:useBean id="info"
		class="com.example.servletjspdemo.web.Alcohol" scope="session" />
	<jsp:setProperty name="person" property="*" />

	<form action="alkoData.jsp">
		<br /><b>TYP:</b><br /> 
		<%
        for(TypEnum e: TypEnum.values())         
            out.print("<input type='radio' name='typ' value=" + e.slownieToString() + ">" + e.slownieToString() + "<br />");
        %>
		
		<br /><b>NAZWA:</b><br /> 
		<input type='text' name='marka' value='${alko.marka}'><br />
		
		<br /><b>RODZAJ:</b><br />
		<select size="10" name="rodzaj" multiple="multiple">
		 <%
         for(RodzajEnum e: RodzajEnum.values())
             out.print("<option value=" + e.rodzajToString() + ">" + e.rodzajToString() + "</option>");
         %>
		</select> <br /> 
		
		<br /><b>POJEMNOSC:</b><br />
		<%
        for(PojemnoscEnum e: PojemnoscEnum.values())         
            out.print("<input type='checkbox' name='pojemnosc' value=" + e.slownieToStirng() + ">" + e.slownieToStirng() +"<br /> ");
        %>
      
		<br /><b>UWAGI:</b><br />	
			<textarea name='info' rows="3" cols="40" >${alko.info}</textarea>	
		<br />
		
		<br /> <input type="submit" value="Zatwierdz">

	</form>
</body>
</html>