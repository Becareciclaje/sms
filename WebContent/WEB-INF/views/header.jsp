<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cj:SMS</title>
<link href="resources/css/curso.css" rel="stylesheet">

</head>
<body >
	<table border="0" width="100%" class="azul">
		<tr>
			<td align="center" width="20%">
				<div class="header"></div>
				<br>
				<label class="labelSmall">cj:</label>
				<label class="labelMedium">S</label>
				<label class="labelBig">M</label><label class="labelMedium">S</label>
			</td>
			<td width="55%"></td>
			<td width="25%" align="left"><c:choose>
					<c:when test="${empty usuario}">
						<a href="/login">Login</a>
						<br>
						<a href="/registro">Registrarse</a>
					</c:when>
					<c:otherwise>
						<div class="nombreusuario">Bienvenido
							${usuario.login}</div>
					</c:otherwise>
				</c:choose></td>
		</tr>				
	</table>
	
		<div id="menu">
			<ul id="nav">
		<c:set var="rolAdmin" value="ADMIN"/>
		<c:set var="rolUser" value="USER"/>
			<c:forEach items="${usuario.roles}" var="rol">
				<c:if test="${rol.rol eq rolAdmin}">
					<li>
						<span>Cuenta</span>
						<ul>
							<li>
								<a href="#">Mantenimiento Cuenta</a>
							</li>
							<li>
								<a href="#">Destinatarios</a>
							</li>
							<li>
								<a href="#">Compra SMS</a>
							</li>
						</ul>
					</li>
				</c:if>
					<c:if test="${rol.rol eq rolUser}">
					<li>
						<span>Envíos</span>
						<ul>
							<li>
								<a href="#">Directos</a>
							</li>
							<li>
								<a href="#">Clientes</a>
							</li>
							<li>
								<a href="#">Masivos personalizados</a>
							</li>
						</ul>
					</li>
				</c:if>
				
			</c:forEach>
			</ul>
		</div>
	
<div class="azul" style="height: 75px;"></div>
<div style="height: 25px;"></div>
</body>
</html>