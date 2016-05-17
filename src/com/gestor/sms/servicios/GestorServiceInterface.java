package com.gestor.sms.servicios;

import java.util.List;

import com.gestor.sms.beans.Registro;
import com.gestor.sms.excepciones.UsuarioExisteException;

public interface GestorServiceInterface
{
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception;

	
}
