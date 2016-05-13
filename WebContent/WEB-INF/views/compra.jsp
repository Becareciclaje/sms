<<<<<<< HEAD
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
	<div>

		<div class="linea">SELECCIONE CUENTA</div>
		<select id="Cuenta" onchange="verCuenta(this.value)" class="linea">

			<sp:select path="Cuenta.id"
				items="${cuenta.id}" itemLabel="nombre"
				itemValue="id" />

		</select>
	</div>

	<sp:form modelAttribute="comprarSMS" action="grabaCompra">
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
=======
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
	<div>

		<div class="linea">SELECCIONE CUENTA</div>
		<select id="Cuenta" onchange="verCuenta(this.value)" class="linea">

			<sp:select path="Cuenta.id"
				items="${cuenta.id}" itemLabel="nombre"
				itemValue="id" />

		</select>
	</div>

	<sp:form modelAttribute="comprarSMS" action="grabaCompra">
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
>>>>>>> branch 'HEAD' of https://github.com/Becareciclaje/sms.git
</html>