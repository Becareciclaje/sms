package com.gestor.sms.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.daos.EnviosDao;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.datos.Envio;
import com.gestor.sms.datos.Usuario;

public class EnviosService extends GestorService implements EnviosServiceInterface
{

	private EnviosDao enviosDao;

	@Override
	@SessionManager
	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception
	{
		// Cuenta cuenta = DameCuenta(id);
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		getEnviosDao().setSession(getGestorDao().getSession());
		getEnviosDao().dameDestinatarios(cuentas, id);
		destinatarios.addAll(cuentas.get(0).getDestinatarios());
	}

	@Override
	@SessionManager
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception
	{
		getGestorDao().cargaEntidadWithFilterProperty(datos, clase, property, value);
	}

	@Override
	@SessionManager
	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception
	{
		getEnviosDao().setSession(getGestorDao().getSession());
		getEnviosDao().cargaCuentasByUsuario(cuentas, usuario);

	}

	@Override
	@SessionManager
	public void grabaEnvios(HttpServletRequest request, Usuario usuario)
	{
		String tipoEnvio = (String) request.getParameter("envios");
		String telefono = request.getParameter("telefono");
		String mensaje = request.getParameter("textoSMS");
		String[] telefonos = request.getParameterValues("telefonos");

		System.out.println(tipoEnvio + "::" + telefono + "::" + mensaje);
		if (telefonos != null)
		{
			for (int i = 0; i < telefonos.length; i++)
			{
				System.out.println(telefonos[i]);
			}
		}

		Envio envio = new Envio();
		String idcuenta = request.getParameter("idCuenta");
		Cuenta cuenta = new Cuenta();
		cuenta.setId(Integer.parseInt(idcuenta));

		if (tipoEnvio.equals("1")) // individual
		{

			envio.setFecha(new Date());
			envio.setTelefono(telefono);
			envio.setTextoSMS(mensaje);
			envio.setIndiicadorEnvio(null);
			envio.setFechaEnvio(null);
			envio.setCuenta(cuenta);
			getGestorDao().grabaDato(envio);
		} else
		{
			for (int i = 0; i < telefonos.length; i++)
			{
				envio = new Envio();
				envio.setFecha(new Date());
				envio.setTelefono(telefonos[i]);
				envio.setTextoSMS(mensaje);
				envio.setIndiicadorEnvio(null);
				envio.setFechaEnvio(null);
				envio.setCuenta(cuenta);
				getGestorDao().grabaDato(envio);

			}
		}

	}

	public EnviosDao getEnviosDao()
	{
		return enviosDao;
	}

	public void setEnviosDao(EnviosDao enviosDao)
	{
		this.enviosDao = enviosDao;
	}

}
