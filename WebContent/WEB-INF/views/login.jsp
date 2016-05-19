<%@page import="com.gestor.sms.datos.Usuario"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="cabecera.jsp"></jsp:include>
<sp:form action="verLogin" method="post" modelAttribute="usuario">
<div class="labelBigBlue" align="left" >LOGIN</div>
	<table style="align:center;">
		<tr>
			<td class="labelSmallblue">USUARIO</td>
			<td><sp:input path="login" /></td>
		</tr>
		<tr>
			<td height="5px"></td>
		</tr>
		<tr>
			<td class="labelSmallblue">CLAVE</td>
			<td><sp:password path="clave" /></td>
		</tr>
		<tr>
		<tr>
			<td height="5px"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				class="button" value="ENVIAR"></td>
		</tr>		
	</table>
	
	<h1 align="center"  style="color: red;">${texto}</h1>

</sp:form>

<jsp:include page="pie.jsp"></jsp:include>

