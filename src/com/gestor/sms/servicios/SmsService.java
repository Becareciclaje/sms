package com.gestor.sms.servicios;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.sms.daos.SmsDAO;
import com.gestor.sms.datos.Usuario;




@Service
public class SmsService extends GestorService implements SmsServiceInterface
{
	@Autowired
	private SmsDAO smsDAO;
	
	public SmsDAO getSmsDAO()
	{
		return smsDAO;
	}

	public void setSmsDAO(SmsDAO smsDAO)
	{
		this.smsDAO = smsDAO;
	}

	public void verificaLogin(Usuario login) throws Exception
	{
		invocarPorReflection(getSmsDAO(),"verificaLogin", login);
	}

	private Object invocarPorReflection(Object origen, String nombreMetodo, Object... parametros) throws Exception
	{
		Object salida = null;
		Class<?>[] clases = new Class<?>[parametros.length];
		for (int i = 0; i < clases.length; i++)
		{
			clases[i] = parametros[i].getClass();
		}
		
			Method method = origen.getClass().getMethod(nombreMetodo, clases);
			salida = method.invoke(origen, parametros);

		
		return salida;
	}

}
