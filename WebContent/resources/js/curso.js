function verPais(pais)
{
	
	$.ajax({
		url : 'https://restcountries.eu/rest/v1/name/' + pais,
		dataType : 'json',
		success : function(json) {
			$("#superior1").
			html("<div class=\"linea rojo\">NOMBRE:</div><div class=\"linea verde\">"
					+json[0].name+"</div>");
			$("#superior2").
			html("<div class=\"linea rojo\">POBLACION:</div><div  class=\"linea verde\">"
					+json[0].population+"</div>");
			$("#superior3").
			html("<div class=\"linea rojo\">SUPERFICIE:</div ><div class=\"linea verde\">"
					+json[0].area+"</div>");
			
		},
		error : function() {
			alert("se ha producido un error")
		}
	});
}



function cargarPaises(region) {

	$.ajax({
		url : 'https://restcountries.eu/rest/v1/region/' + region,
		dataType : 'json',
		success : function(json) {
			$("#paises").html(
					"<option value=\"0\">Selecciona pais....</option>")
			for (i = 0; i < json.length; i++) {
				$("#paises").append(
						"<option value=\"" + json[i].name + "\">"
								+ json[i].name + "</option>");
			}
		},
		error : function() {
			alert("se ha producido un error")
		}
	});

}

function hola() {
	alert("hola como estas");

}

function cambiarTexto() {
	$("#capa").append($("#texto").val() + "<br>");

}

function mayuscula() {
	texto = document.forms[0].t1.value;
	alert("has escrito " + texto.toUpperCase());

	document.forms[0].ta.value = texto.toUpperCase();
	document.forms[0].t1.value = "";
	document.getElementsByTagName("nav")[0].innerHTML = "<h1>" + texto
			+ "</h1>";
}
