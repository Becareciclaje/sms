package com.gestor.sms.servicios;

import com.gestor.sms.daos.GestorDao;

public class GestorService
{
	
	private GestorDao gestorDao;

	public GestorDao getGestorDao()
	{
		return gestorDao;
	}

	public void setGestorDao(GestorDao gestorDao)
	{
		this.gestorDao = gestorDao;
	}


}
