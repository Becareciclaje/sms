package com.gestor.sms.servicios;

import java.util.ArrayList;
import java.util.List;

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
		//Cuenta cuenta = DameCuenta(id);
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		getEnviosDao().setSession(getGestorDao().getSession());
		getEnviosDao().dameDestinatarios(cuentas, id);
		destinatarios.addAll(cuentas.get(0).getDestinatarios());
		//System.out.println("ejemplo");
	}

	private Cuenta DameCuenta(int id)
	{
		// TODO Auto-generated method stub
		return null;
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
	@SessionManager
	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception
	{
		getEnviosDao().setSession(getGestorDao().getSession());
		getEnviosDao().cargaCuentasByUsuario(cuentas, usuario);
		
	}


}
