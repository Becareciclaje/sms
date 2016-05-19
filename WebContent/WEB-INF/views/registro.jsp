
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="cabecera.jsp"></jsp:include>
	<div class="labelBigBlue" align="left" >REGISTRO</div>
	<sp:form modelAttribute="registro" action="altaUsuario">
		<table  align="center">
		    <tr>
				<td class="labelSmallblue">USUARIO</td>
				<td><sp:input path="usuario.login" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">CLAVE</td>
				<td><sp:input path="usuario.clave" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">NOMBRE</td>
				<td><sp:input path="cuenta.nombre" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">NIF</td>
				<td><sp:input path="cuenta.nif" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">TIPO CONTRATO</td>
				<td><sp:input path="cuenta.tipoContrato" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">TELEFONO</td>
				<td><sp:input path="cuenta.telefono" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">MAIL</td>
				<td><sp:input path="cuenta.mail" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">AUTORIZADO</td>
				<td><sp:input path="cuenta.autorizado" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">REMITENTE</td>
				<td><sp:input path="cuenta.remitente" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">DIRECCION</td>
				<td><sp:input path="cuenta.direccion" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">CODIGO POSTAL</td>
				<td><sp:input path="cuenta.codigoPostal" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">POBLACION</td>
				<td><sp:input path="cuenta.poblacion" /></td>
			</tr>
			<tr>
				<td class="labelSmallblue">PROVINCIA</td>
				<td><sp:input path="cuenta.provincia" /></td>
			</tr>
			<tr>
			<td height="5px"></td>
		</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="GRABAR" class="button"></td>
			</tr>
		</table>
		<h1 style="color: red;">${texto}</h1>		
	</sp:form>
<jsp:include page="pie.jsp"></jsp:include>
