
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
