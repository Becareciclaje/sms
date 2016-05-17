package com.gestor.sms.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ComprasService extends GestorService 
{

	@Override
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception
	{
		getGestorDao().cargaEntidadWithFilterProperty(datos, clase, property, value);
	}

	

	

	

}
