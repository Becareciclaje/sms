package com.gestor.sms.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestor.sms.daos.GestorDao;


public class GestorService implements GestorServiceInterface
{
	@Autowired
	private GestorDao gestorDao;

	public GestorDao getGestorDao()
	{
		return gestorDao;
	}

	public void setGestorDao(GestorDao gestorDao)
	{
		this.gestorDao = gestorDao;
	}

	@Override
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception
	{
		getGestorDao().cargaEntidadWithFilterProperty(datos, clase, property, value);
	}


}
