<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="cabecera.jsp"></jsp:include>

<sp:form modelAttribute="destinatarios" action="seleccionar"
	method="GET" methodParam="GET">
<div class="labelBigBlue" align="left">ENVÍO SMS</div>
	<table align="center" >
		<tr>
			<td colspan="2" align="center">
				<select id="Cuenta" class="linea" items="${cuentas }" itemValue="id"
					path="id" onchange="cargarDestinarios(this.value)" width="200">
					<c:forEach items="${cuentas }" var="cuenta">
						<option value="${cuenta.id }">${cuenta.nif }-
							${cuenta.nombre }</option>
					</c:forEach>
				</select> 	
			</td>
		</tr>
		<tr>
			<td class="labelSmallblue">TIPO DE ENVÍO:</td>
			<td>
				<select id="envios" name="envios"
					onchange="arreglacapa(this.value)" class="linea">
					<option value="0">Selecciona...</option>
					<option value="1">individual</option>
					<option value="2">masivo</option>
					<option value="3">personalizado</option>
				</select>					
			</td>
		</tr>
		<tr>
			<td class="labelSmallblue">Texto SMS a enviar:</td>
			<td>
				
				<label class="labelSmallblue">caracteres disponibles: </label><input id="caracteres" readonly="readonly"></input>
				<br>
				<textarea rows="10" cols="80" id="textoSMS" name="textoSMS" onkeydown="cuentaletras()"></textarea>
			</td>
		</tr>	
		<tr>
			<td colspan="2" align="center">
				<div class="labelSmallblue" id="etiquetaSMS" style="border-style: solid; size: portrait">Para
					personalizar el texto de su SMS introduzca "{nombre}" en el lugar
					adecuado para que sea sustituido por el nombre de su destinatario</div>
			</td>
		</tr>
		<tr>
			<td class="labelSmallblue">Nº teléfono:</td>
			<td>
				<input type="text" name="telefono">
			</td>
		</tr>			
				
	</table>

	
	
	

	<br>

	
	<br>

	<div id="listadestinatarios"
		style="width: 450px; height: 100px; overflow: auto; visibility: hidden;">
		<input type="checkbox" id="cbgroup1_master"
			onchange="togglecheckboxes(this,'telefonos[]')"> Toggle All
		<table border="1">
			<c:forEach items="${destinatarios }" var="destinatario">
				<tr>
					<td width="10"><input type="checkbox"
						value="${destinatario.telefono }" name="telefonos[]"></td>
					<td width="200">${destinatario.nombre }</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div>
		<input type="submit" class="button"  value="ENVIAR">
	</div>

</sp:form>

<jsp:include page="pie.jsp"></jsp:include>

