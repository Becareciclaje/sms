
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
	<sp:form action="verLogin" method="post" modelAttribute="usuario">

		<table border="1">
			<tr>
				<td>USUARIO</td>
				<td><sp:input path="login" /></td>
			</tr>
			<tr>
				<td>CLAVE</td>
				<td><sp:password path="clave" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="ENVIAR"></td>
			</tr>
		</table>

	</sp:form>
</body>

</html>

