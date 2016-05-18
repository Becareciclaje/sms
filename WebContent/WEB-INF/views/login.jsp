<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="cabecera.jsp"></jsp:include>
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
		<h1 style="color: red;">${texto}</h1>

	</sp:form>
<jsp:include page="pie.jsp"></jsp:include>

