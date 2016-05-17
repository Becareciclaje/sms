package com.gestor.sms.servicios;

import java.util.List;

import com.gestor.sms.datos.Compra;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;

public interface ComprasServiceInterface extends GestorServiceInterface
{

	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception;
	public void grabaCompra(Compra compra) throws Exception;

}
