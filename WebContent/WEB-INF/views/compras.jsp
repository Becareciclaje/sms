
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
	<sp:form modelAttribute="compra" action="grabaCompra">
		<div>

			<div class="linea">SELECCIONE CUENTA</div>
			<sp:select id="Cuenta" class="linea" items="${cuentas }" itemLabel="nif" itemValue="id" path="cuenta.id"> 
		

			</sp:select>
		</div>

		<br>
		<br>
		<h1 style="color: red;">${resultado}</h1>
		
			<table border="1">
				<tr>
					<td>CANTIDAD</td>
					<td><sp:input path="cantidad" /></td>
				</tr>
				
				<tr>
					<td>FECHA</td>
					<td><sp:input path="fecha" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="COMPRAR"></td>
				</tr>

			</table>

		

		<table border="1">
			<tr>
				<td>CANTIDAD</td>
				<td>CUENTA</td>
				<td>FECHA</td>

			</tr>

		</table>
		<div align="center">
			<input type="submit" value="COMPRAR"
				style="background-color: red; font-size: 25px;">
		</div>
	</sp:form>

</body>

</html>