package com.gestor.sms.servicios;

import java.util.List;

public interface GestorServiceInterface
{
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception;
}
