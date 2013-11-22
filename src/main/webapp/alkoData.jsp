<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>alkoData</title>
</head>
<body bgcolor="#339933">
	<h1>ALKOHOLE</h1>
	<img
		src="http://www.alkohole.wortale.net/gal/alkohole-inne-alkohole-13239847630666.jpg"
		align="right" />
	<jsp:useBean id="typ" class="com.example.servletjspdemo.web.Alcohol"
		scope="session" />
	<jsp:useBean id="alko" class="com.example.servletjspdemo.web.Alcohol"
		scope="session" />
	<jsp:useBean id="info" class="com.example.servletjspdemo.web.Alcohol"
		scope="session" />
	<jsp:useBean id="storage"
		class="com.example.servletjspdemo.service.StorageSer"
		scope="application" />
	<jsp:setProperty property="*" name="alko" />

	<form action="showAllAlcohols.jsp" method="get">
		<br /> TYP ALKOHOLU: ${alko.typ} <br /> NAZWA: ${alko.marka} <br />
		RODZAJ:
		<%
 			String wyswietlRodzaj[] = request.getParameterValues("rodzaj");
 			if (wyswietlRodzaj != null && wyswietlRodzaj.length != 0) {
 				for (int i = 0; i < wyswietlRodzaj.length; i++) {
 					out.println(wyswietlRodzaj[i] + ",");
 				}

 				alko.setRodzaj(wyswietlRodzaj);
 			}
 		%>

		<br /> POJEMNOŚĆ:
		<%
			String wyswietPojemnosc[] = request.getParameterValues("pojemnosc");
			if (wyswietPojemnosc != null && wyswietPojemnosc.length != 0) {
				for (int i = 0; i < wyswietPojemnosc.length; i++) {
					out.println(wyswietPojemnosc[i] + ",");
				}

				alko.setPojemnosc(wyswietPojemnosc);
			}
		%>

		<%
			alko.setInfo(request.getParameter("info"));
		%>

		<br /> UWAGI: ${alko.info}<br />

		<%
			storage.add(alko);
			session.removeAttribute("alko");
			//out.println("<p><u>Typ:</u> " + alko.getMarka() + ". <u>Marka:</u> " + alko.getTyp() + ". <u>Rodzaj:</u> " + alko.getRodzajToString() + ". <u>Pojemnosc:</u> " + alko.getPojemnoscToString() + ". <u>Uwagi:</u> " + alko.getInfo() + "<br /></p>");
		%>


		<br /> <br /> <input type="submit" value="Show all alcohols">
	</form>
	<br />
	<form action="Alcohols.jsp" method="get">
		<input type="submit" value="Back">
	</form>
</body>
</html>