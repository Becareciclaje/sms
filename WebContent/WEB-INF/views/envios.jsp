<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="cabecera.jsp"></jsp:include>
	<sp:form modelAttribute="destinatarios" action="seleccionar" method="GET" methodParam="GET">

		<div>

			<div class="linea">SELECCIONE CUENTA</div>
			<sp:select id="Cuenta" class="linea" items="${cuentas }"  itemValue="id" path="cuenta.id"> 
			</sp:select>
		</div>


	<div>
		<div class="linea">TIPO DE ENVÍO:</div>
		<select id="envios" name="envios" onchange="cargarDestinarios(this.value)"
			class="linea">
			<option value="0">Selecciona Tipo de Envío...</option>
			<option value="1">individual</option>
			<option value="2">masivo</option>
			<option value="3">personalizado</option>
		</select>
	</div>

	Texto SMS a enviar:
	<textarea rows="10" cols="80" id="textoSMS" name="textoSMS" onkeydown="cuentaletras()"></textarea>
	caracteres disponibles: <input id="caracteres" readonly="readonly"></input> 
	 
	<br>

		<div id="etiquetaSMS" style="border-style: solid; size: portrait">Para
			personalizar el texto de su SMS introduzca "{nombre}" en el lugar
			adecuado para que sea sustituido por el nombre de su destinatario</div>

		<div id="telefonoIndividual" style="border-style: none; size: portrait">
		<br> Nº teléfono: <input type="text" name="telefono">
		</div>

		<br>

		<div id="listadestinatarios"
			style="width: 450px; height: 100px; overflow: auto; border-style: solid">
			<table>
				<c:forEach items="${destinatarios }" var="destinatario">
					<tr>
						<td><input type="checkbox" value="${destinatario.telefono }"
							name="telefonos"></td>
						<td>${destinatario.nombre }</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div>
			<input type="submit" value="ENVIAR">
		</div>

	</sp:form>

<jsp:include page="pie.jsp"></jsp:include>

