package com.gestor.sms.servicios;

import java.util.List;

import com.gestor.sms.datos.Cuenta;

public interface ComprasServiceInterface
{
	
	public void dameCuentas(List<Cuenta> cuentas, int id) throws Exception;

}
