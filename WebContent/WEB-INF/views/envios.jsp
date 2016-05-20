<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="cabecera.jsp"></jsp:include>
<br>
<<<<<<< HEAD
<sp:form modelAttribute="envio" action="envios"
	method="GET" methodParam="GET">
<div class="labelBigBlue" align="left">ENVÍO SMS</div>
=======
>>>>>>> 93ccedc71d9a38a7b6bedc03ec503c65467ca4a2
<sp:form modelAttribute="destinatarios" action="envios" method="GET"
	methodParam="GET">
	<div class="labelBigBlue" align="left">ENVÍO SMS</div>
	<table align="center" >
		<tr>
			<td class="labelSmallblue">TIPO DE ENVÍO:</td>
			<td><select id="envios" name="envios"
				onchange="arreglacapa(this.value)" class="linea">
					<option value="0">Selecciona...</option>
					<option value="1">individual</option>
					<option value="2">masivo</option>
					<option value="3">personalizado</option>
			</select></td>
		</tr>
		<tr>
			<td class="labelSmallblue">CUENTA:</td>
<<<<<<< HEAD
			<td align="center">
				<sp:select id="Cuenta" name="Cuenta" class="linea" items="${envio.cuentas }" itemValue="id"
					path="cuenta.id" width="200">
			<td><select id="Cuenta" name="Cuenta" class="linea"
				items="${cuentas }" itemValue="id" path="cuenta.id" width="200">
					
				</sp:select> 	
=======
			<td><select id="Cuenta" name="Cuenta" class="linea"
				items="${cuentas }" itemValue="id" path="cuenta.id" width="200">
>>>>>>> 93ccedc71d9a38a7b6bedc03ec503c65467ca4a2
					<c:forEach items="${cuentas }" var="cuenta">
						<option value="${cuenta.id }">${cuenta.nif }-
							${cuenta.nombre }</option>
					</c:forEach>
			</select></td>
		</tr>
		<tr>
			<td height="5px"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" class="button" value="BUSCAR DESTINATARIOS">
			</td>
		</tr>
		<tr>
			<td height="5px"></td>
		</tr>
	</table>
</sp:form>

<sp:form modelAttribute="envio" action="seleccionar"
	method="GET" methodParam="GET">

	<!--  <input type="text" name="idCuenta" value="${cuenta }">
	<input type="text" name="envios" value="${tipoenvio }">-->

	<table align="center" >
		<tr>
			<td class="labelSmallblue">TEXTO SMS A ENVIAR:</td>
			<td><label class="labelSmallblue">CARÁCTERES DISPONIBLES
			</label><label class="labelSmallblue" id="caracteres">160</label> <!--  <input id="caracteres" readonly="readonly"></input>-->
				<br> <br> <textarea rows="10" cols="80" id="textoSMS"
					name="textoSMS" onkeydown="cuentaletras()"></textarea></td>
		</tr>
<<<<<<< HEAD
		<tr>
			<td colspan="2" align="left">
				<div class="labelSmallblue" id="etiquetaSMS"
					style="border-style: solid; size: portrait; display: none;">
					Para personalizar el texto de su SMS introduzca "{nombre}" en el
					lugar adecuado para que <br>sea sustituido por el nombre de su
					destinatario
				</div>
			</td>
		</tr>
		<tr>
			<td class="labelSmallblue">Nº TELÉFONO:</td>
			<td><input type="text" name="telefono"></td>
		</tr>
		<tr>
			<td height="10px"></td>
		</tr>
	</table>
	<table align="center" >
		<tr>
			<td class="labelSmallblue">
				<div id="listadestinatarios"
					style="width: 450px; height: 100px; overflow: auto; visibility: hidden;">
					<input type="checkbox" id="cbgroup1_master"
						onchange="togglecheckboxes(this,'telefonos')" > SELECCIONAR TODOS 
					<table style="border-top: double; border-bottom: double; border-right: double; border-left: double;" >
						<c:forEach items="${destinatarios }" var="destinatario">
							<tr>
								<td width="10"><input type="checkbox"
									value="${destinatario.telefono }" name="telefonos"></td>
								<td width="200">${destinatario.nombre }</td>
							</tr>
						</c:forEach>
					</table>
=======
		<tr>
			<td colspan="2" align="left">
				<div class="labelSmallblue" id="etiquetaSMS"
					style="border-style: solid; size: portrait; display: none;">
					Para personalizar el texto de su SMS introduzca "{nombre}" en el
					lugar adecuado para que <br>sea sustituido por el nombre de su
					destinatario
>>>>>>> 93ccedc71d9a38a7b6bedc03ec503c65467ca4a2
				</div>
			</td>
		</tr>
		<tr>
			<td class="labelSmallblue">Nº TELÉFONO:</td>
			<td><input type="text" name="telefono"></td>
		</tr>
		<tr>
			<td height="10px"></td>
		</tr>
	</table>
	<table align="center" >
		<tr>
			<td class="labelSmallblue">
				<div id="listadestinatarios"
					style="width: 450px; height: 100px; overflow: auto; visibility: hidden;">
					<input type="checkbox" id="cbgroup1_master"
						onchange="togglecheckboxes(this,'telefonos')" > SELECCIONAR TODOS 
					<table style="border-top: double; border-bottom: double; border-right: double; border-left: double;" >
						<c:forEach items="${destinatarios }" var="destinatario">
							<tr>
								<td width="10"><input type="checkbox"
									value="${destinatario.telefono }" name="telefonos"></td>
								<td width="200">${destinatario.nombre }</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</td>
<<<<<<< HEAD
		</tr>			
				
	</table>		
	<br>
	<br>
	<div id="listadestinatarios"
		style="width: 450px; height: 100px; overflow: auto; visibility: hidden;">
		<input type="checkbox" id="cbgroup1_master"
			onchange="togglecheckboxes(this,'telefonos')"> Toggle All
		<table border="1">
			<c:forEach items="${envio.destinatarios }" var="destinatario">
				<tr>
					<td width="10"><input type="checkbox"
						value="${destinatario.telefono }" name="telefonos"></td>
					<td width="200">${destinatario.nombre }</td>
				</tr>
			</c:forEach>
		</table>
	</div>

	<div>
		<input type="submit" class="button"  value="ENVIAR">
	</div>
=======
		</tr>
		<tr>
>>>>>>> 93ccedc71d9a38a7b6bedc03ec503c65467ca4a2
			<td height="5px"></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				class="button" value="ENVIAR"></td>
		</tr>
	</table>

</sp:form>

<jsp:include page="pie.jsp"></jsp:include>

