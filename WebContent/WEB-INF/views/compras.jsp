
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>
	<sp:form modelAttribute="compra" action="grabaCompra">
		<div>

			<div class="linea">SELECCIONE CUENTA</div>
			<sp:select id="Cuenta" class="linea" items="${cuentas }"  itemValue="id" path="cuenta.id"> 
		

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
					<td><sp:input path="fechaTexto" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="COMPRAR"></td>
				</tr>

			</table>
			<h1 style="color: red;">${error }</h1>
				
	</sp:form>

</body>

</html>