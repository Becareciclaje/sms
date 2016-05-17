package com.gestor.sms.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.daos.EnviosDao;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.datos.Usuario;


public class EnviosService extends GestorService implements EnviosServiceInterface
{



	private EnviosDao enviosDao;

	@Override
	@SessionManager
	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception
	{
		getEnviosDao().setSession(getGestorDao().getSession());
		getEnviosDao().dameDestinatarios(destinatarios, id);

	}

	public EnviosDao getEnviosDao()
	{
		return enviosDao;
	}

	public void setEnviosDao(EnviosDao enviosDao)
	{
		this.enviosDao = enviosDao;
	}

	
	@Override
	@SessionManager
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception
	{
		getGestorDao().cargaEntidadWithFilterProperty(datos, clase, property, value);
	}

	@Override
	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception
	{
		// TODO Auto-generated method stub
		
	}
	
}
