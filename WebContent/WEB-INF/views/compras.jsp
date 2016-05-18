
<%@page import="com.gestor.sms.datos.Usuario"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
usuario:${session }
<c:if test="${empty session.usuario || session.usuario.id eq 0  }">

</c:if>
<jsp:include page="cabecera.jsp"></jsp:include>

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