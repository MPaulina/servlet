<%@page import="com.example.servletjspdemo.web.Alcohol"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>showAllAlcohols</title>
</head>
<body bgcolor="#339933">
<h1>ALKOHOLE</h1>
<img src="http://www.alkohole.wortale.net/gal/alkohole-inne-alkohole-13239847630666.jpg" align="right" />
	<jsp:useBean id="storage"
		class="com.example.servletjspdemo.service.StorageSer"
		scope="application" />
			<jsp:setProperty property="*" name="alko" />
	
		<%		

			for (Alcohol alko : storage.getAllAlcohols()) {
				out.println("<p><u>Typ:</u> " + alko.getMarka() + ". <u>Marka:</u> " + alko.getTyp() + ". <u>Rodzaj:</u> " + alko.getRodzajToString() + ". <u>Pojemnosc:</u> " + alko.getPojemnoscToString() + ". <u>Uwagi:</u> " + alko.getInfo() + "<br /></p>");
			}
		%>

		<form action="Alcohols.jsp" method="get">
			<input type="submit" value="Add another alcohol">
		</form>
</body>
</html>
