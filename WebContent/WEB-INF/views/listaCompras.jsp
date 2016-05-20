%@page import="com.gestor.sms.datos.Usuario"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
usuario:${session }
<c:if test="${empty session.usuario || session.usuario.id eq 0  }">

</c:if>
<jsp:include page="cabecera.jsp"></jsp:include>

<body>

	<sp:form modelAttribute="compra" action="listaCompras">
		<div>

			<div class="linea">SELECCIONE CUENTA</div>
			<sp:select id="Cuenta" class="linea" items="${cuentas }"  itemValue="id" path="cuenta.id"> 
		

			</sp:select>
			<input type="submit" value="SELECCIONAR">
		</div>
		</sp:form>

		

		<table border="1">
			<tr>
				<td>CANTIDAD</td>
				<td>CUENTA</td>
				<td>FECHA</td>

			</tr>


			
			<c:forEach items="${compras}" var="compra">
				

				<tr>
					<td>${compra.cantidad}</td>
					<td>${compra.cuenta}</td>
					<td>${compra.fecha}</td>
					
				</tr>
				
			</c:forEach>
		</table>

</body>

</html>