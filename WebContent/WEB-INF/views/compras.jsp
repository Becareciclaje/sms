
<%@page import="com.gestor.sms.datos.Usuario"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<jsp:include page="cabecera.jsp"></jsp:include>

<sp:form modelAttribute="compra" action="grabaCompra">
	<div class="labelBigBlue" align="left">COMPRA SMS</div>

	<table align="center">

		<tr>
			<td class="labelSmallblue">SELECCIONE CUENTA</td>
			<td><sp:select id="Cuenta" class="linea" items="${cuentas }"
					itemValue="id" path="cuenta.id">


				</sp:select></td>
		</tr>
		<tr>
			<td class="labelSmallblue">CANTIDAD</td>
			<td><sp:input path="cantidad" /></td>
		</tr>

		<tr>
			<td class="labelSmallblue">FECHA</td>
			<td><sp:input path="fechaTexto" /></td>
		</tr>
		<tr>
			<td height="5px"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				class="button" value="COMPRAR"></td>
		</tr>

	</table>
	<h1 align="center" style="color: red;">${resultado}</h1>
	<h1 align="center" style="color: red;">${error }</h1>

</sp:form>
<jsp:include page="pie.jsp"></jsp:include>