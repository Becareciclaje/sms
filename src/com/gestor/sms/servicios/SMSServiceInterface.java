package com.gestor.sms.servicios;

import com.gestor.sms.beans.Registro;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;

public interface SMSServiceInterface
{

	public void registro(Registro registro) throws UsuarioExisteException;
	public void altausuario(Registro registro) throws Exception;
	public void verUsuario(Usuario  usuario) throws Exception;
}
