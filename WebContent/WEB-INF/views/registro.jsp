<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sp:form modelAttribute="registro" action="altaUsuario">
		<table border="1">
		    <tr>
				<td>USUARIO</td>
				<td><sp:input path="usuario.login" /></td>
			</tr>
			<tr>
				<td>CLAVE</td>
				<td><sp:input path="usuario.clave" /></td>
			</tr>
			<tr>
				<td>NOMBRE</td>
				<td><sp:input path="cuenta.nombre" /></td>
			</tr>
			<tr>
				<td>NIF</td>
				<td><sp:input path="cuenta.nif" /></td>
			</tr>
			<tr>
				<td>TIPOCONTRATO</td>
				<td><sp:input path="cuenta.tipoContrato" /></td>
			</tr>
			<tr>
				<td>TELEFONO</td>
				<td><sp:input path="cuenta.telefono" /></td>
			</tr>
			<tr>
				<td>MAIL</td>
				<td><sp:input path="cuenta.mail" /></td>
			</tr>
			<tr>
				<td>AUTORIZADO</td>
				<td><sp:input path="cuenta.autorizado" /></td>
			</tr>
			<tr>
				<td>REMITENTE</td>
				<td><sp:input path="cuenta.remitente" /></td>
			</tr>
			<tr>
				<td>DIRECCION</td>
				<td><sp:input path="cuenta.direccion" /></td>
			</tr>
			<tr>
				<td>CODIGOPOSTAL</td>
				<td><sp:input path="cuenta.codigoPostal" /></td>
			</tr>
			<tr>
				<td>POBLACION</td>
				<td><sp:input path="cuenta.poblacion" /></td>
			</tr>
			<tr>
				<td>PROVINCIA</td>
				<td><sp:input path="cuenta.provincia" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="GRABAR"></td>
			</tr>
		</table>		
	</sp:form>
</body>
</html>