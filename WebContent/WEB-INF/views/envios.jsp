<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Envíos</title>

<script type="text/javascript">

function cargarDestinarios(i) {
	if(i==0 || i==1)
		{
		document.getElementById('listadestinatarios').style.display = 'none';
		document.getElementById('etiquetaSMS').style.display = 'none';
		document.getElementById('telefonoIndividual').style.display = 'block';
		}
	else
		{
		document.getElementById('listadestinatarios').style.display = 'block';
		document.getElementById('etiquetaSMS').style.display = 'block';
		document.getElementById('telefonoIndividual').style.display = 'none';
		}
	document.getElementById("caracteres").value = "160";
}

function cuentaletras()
{
	document.getElementById("caracteres").value = 160 -
		(document.getElementById('textoSMS').value.length + 1) ;
}

</script>


</head>
<body>

	<sp:form modelAttribute="destinatarios" action="seleccionar">

	<div>
		<div class="linea">TIPO DE ENVÍO:</div>
		<select id="envios" onchange="cargarDestinarios(this.value)"
			class="linea">
			<option value="0">Selecciona Tipo de Envío...</option>
			<option value="1">individual</option>
			<option value="2">masivo</option>
			<option value="3">personalizado</option>
		</select>
	</div>

	Texto SMS a enviar:
	<textarea rows="10" cols="80" id="textoSMS" onkeydown="cuentaletras()"></textarea>
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
						<td><input type="checkbox" value="destinatario.telefono"
							name="destinatario.telefono"></td>
						<td>${destinatario.nombre }</td>
					</tr>
				</c:forEach>
			</table>
		</div>

		<div>
			<input type="submit" value="ENVIAR">
		</div>

	</sp:form>
</body>

</html>