package com.gestor.sms.servicios;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.datos.Usuario;

public interface EnviosServiceInterface extends GestorServiceInterface
{

	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception;
	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception;
	public void grabaEnvios(HttpServletRequest request,Usuario usuario) throws Exception;
	
}
