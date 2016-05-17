package com.gestor.sms.servicios;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.anotaciones.TransactionManager;
import com.gestor.sms.beans.Registro;
import com.gestor.sms.daos.SMSDao;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;

public class SMSService extends GestorService implements SMSServiceInterface
{
	
	private SMSDao smsDao;

	@Override
	@SessionManager
	public void registro(Registro registro) throws UsuarioExisteException
	{
		try
		{
			getSmsDao().verUsuario(registro.getUsuario());
			altausuario(registro);
			
		} catch (UsuarioExisteException e)
		{
			throw e;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@SessionManager
	public void verUsuario(Usuario  usuario) throws  Exception
	{
		getSmsDao().setSession(getGestorDao().getSession());
		getSmsDao().verUsuario(usuario);
	}

	@Override
	@TransactionManager
	public void altausuario(Registro registro) throws Exception
	{
		
		
	}

	public SMSDao getSmsDao()
	{
		return smsDao;
	}

	public void setSmsDao(SMSDao smsDao)
	{
		this.smsDao = smsDao;
	}

	

}
