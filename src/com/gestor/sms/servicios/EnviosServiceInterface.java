package com.gestor.sms.servicios;

import java.util.List;

import com.gestor.sms.datos.Destinatario;

public interface EnviosServiceInterface
{

	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception;
	
}
