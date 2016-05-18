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
					<c:when test="${empty nombreUsuario.id}">
						<a href="/login">Login</a>
						<br>
						<a href="/registro">Registrarse</a>
					</c:when>
					<c:otherwise>
						<div class="nombreusuario">Bienvenido
							${nombreUsuario.nombre}</div>
					</c:otherwise>
				</c:choose></td>
		</tr>				
	</table>
	
		<div id="menu">
			<ul id="nav">
			<!--<c:set var="i" value="0"></c:set>
			<c:forEach items="${nombreUsuario.rol}" var="rol">
				<c:if test="${nombreUsuario.rol eq '1'}">-->
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
				<!--</c:if>
				<c:if test="${nombreUsuario.rol eq '2'}">-->
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
				<!--</c:if>
				<c:set var="i" value="${i+1}"></c:set>
			</c:forEach>-->
			</ul>
		</div>
	
<div class="azul" style="height: 75px;"></div>
<div style="height: 25px;"></div>
</body>
</html>