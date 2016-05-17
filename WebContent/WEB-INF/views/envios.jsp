<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Env�os</title>
</head>
<body>

	<div>
		<div class="linea">TIPO DE ENV�O:</div>
		<select id="envios" onchange="cargarDestinarios(this.value)"
			class="linea">
			<option value="0">Selecciona Tipo de Env�o...</option>
			<option value="1">individual</option>
			<option value="2">masivo</option>
			<option value="3">personalizado</option>
		</select>
	</div>

	Texto SMS a enviar:
	<textarea rows="10" cols="80" id="textoSMS"></textarea>
	caracteres disponibles: ${textoSMS.length()}

	<br>

	<div style="border-style: solid; size: portrait">Para
		personalizar el texto de su SMS introduzca "{nombre}" en el lugar
		adecuado para que sea sustituido por el nombre de su destinatario</div>

	<br> N� tel�fono:
	<input type="text" name="telefono">

	<br>

	<sp:form modelAttribute="destinatarios" action="seleccionar">
		<div style="width: 450px; height: 80px; overflow: auto; border-style: solid">
			<table>
			
<%-- 				<tr>
					<td><input type="checkbox" name="destinatario.id"></td>
					<td><input path="destinatario.nombre" /></td>


						<td><sp:input path="destinatarios[${i}].telefono" /></td>
						<td><sp:input path="destinatarios[${i}].nombre" /></td>

				</tr>
 --%>				
				<c:set var="i" value="0"></c:set>

				<c:forEach var="i" begin="1" end="5" step="1"> 
					<tr>
						<td><sp:input path="${i}" /></td>
					</tr>				
				</c:forEach>
				 
				<!-- <c:forEach items="${destinatario}" var="destinatarios">  
					<tr>
						<td><sp:input path="${i}" /></td>
					</tr>

					<c:set var="i" value="${i+1}"></c:set>
				</c:forEach>
-->
			</table>
		</div>

		<div>
			<input type="submit" value="ENVIAR">
		</div>

	</sp:form>
</body>

</html>