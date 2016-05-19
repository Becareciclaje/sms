
function cargarDestinarios(id) {
	// para invocar a AJAX
	
	//alert("Before Ajax..!");
	
	$.ajax({  
        type : 'GET',  
        url : "/destinatarios",  

    });	

	alert("Despues Ajax..!");
}

/*
 * 
			<c:forEach items="${destinatarios }" var="destinatario">
				<tr><td width=\"10\"><input type=\"checkbox\" value=\"${destinatario.telefono }\" name="telefonos[]"></td>
					<td width="200">${destinatario.nombre }</td>
				</tr></c:forEach></table>
 * 
 */

function arreglacapa(i) {
	if (i == 0 || i == 1) {
		// document.getElementById('listadestinatarios').style.display = 'none';
		document.getElementById('listadestinatarios').style.visibility = 'hidden';
		document.getElementById('etiquetaSMS').style.display = 'none';
		document.getElementById('telefonoIndividual').style.display = 'block';
	} else {
		document.getElementById('listadestinatarios').style.visibility = 'visible';
		document.getElementById('etiquetaSMS').style.display = 'block';
		document.getElementById('telefonoIndividual').style.display = 'none';
	}
	document.getElementById('textoSMS').value = "";
	document.getElementById("caracteres").value = "160";
}

function cuentaletras() {
	document.getElementById("caracteres").value = 160 - (document
			.getElementById('textoSMS').value.length + 1);
}

function togglecheckboxes(master, group) {
	var cbarray = document.getElementsByName(group);
	for (var i = 0; i < cbarray.length; i++) {
		cbarray[i].checked = master.checked;
	}
}
