<%@page import="com.gestor.sms.datos.Usuario"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<jsp:include page="cabecera.jsp"></jsp:include>



<sp:form modelAttribute="compra" action="listaCompras">

	<div class="labelBigBlue" align="left">LISTADO COMPRA SMS</div>
	<table align="center">
		<tr>
			<td><sp:select id="Cuenta" class="linea" path="cuenta.id">
					<sp:option value="0">Selecciona cuenta...</sp:option>
					<sp:options items="${cuentas }" itemValue="id" />
				</sp:select>
			</td>
		</tr>
		<tr>
			<td height="5px"></td>
		</tr>
		<tr>
			<td align="center">
				<input type="submit" class="button" value="SELECCIONAR">				
			</td>
		</tr>
		<tr>
			<td height="5px"></td>
		</tr>
	</table>	
</sp:form>



<table border="1" align="center">
	<tr>
		<td class="labelMediumblue" align="center">CANTIDAD</td>
		<td class="labelMediumblue" align="center">CUENTA</td>
		<td class="labelMediumblue" align="center">FECHA</td>
	</tr>
	<c:forEach items="${compras}" var="compra">
		<tr>
			<td class="labelSmallblue">${compra.cantidad}</td>
			<td class="labelSmallblue">${compra.cuenta}</td>
			<td class="labelSmallblue">${compra.fecha}</td>
		</tr>
	</c:forEach>
</table>

<jsp:include page="pie.jsp"></jsp:include>
