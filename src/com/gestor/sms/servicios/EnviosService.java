package com.gestor.sms.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.daos.EnviosDao;
import com.gestor.sms.datos.Destinatario;

@Service
public class EnviosService extends GestorService implements EnviosServiceInterface
{


	@Autowired
	private EnviosDao enviosDao;

	@Override
	@SessionManager
	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception
	{
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

	
}
