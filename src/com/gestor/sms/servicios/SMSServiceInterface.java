package com.gestor.sms.servicios;

import com.gestor.sms.beans.Registro;
import com.gestor.sms.excepciones.UsuarioExisteException;

public interface SMSServiceInterface
{

	public void verLogin(Registro registro) throws UsuarioExisteException;
	public void altausuario(Registro registro) throws Exception;
}
