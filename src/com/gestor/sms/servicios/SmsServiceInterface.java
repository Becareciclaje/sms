package com.gestor.sms.servicios;

import com.gestor.sms.datos.Usuario;

public interface SmsServiceInterface
{
	public void verificaLogin(Usuario login) throws Exception;
}
