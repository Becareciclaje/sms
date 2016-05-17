package com.gestor.sms.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.daos.ComprasDao;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;


public class ComprasService extends GestorService implements ComprasServiceInterface
{

	private ComprasDao comprasdao;

	@Override
	@SessionManager
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value)
			throws Exception
	{
		getGestorDao().cargaEntidadWithFilterProperty(datos, clase, property, value);
	}

	@Override
	@SessionManager
	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception
	{
		getComprasdao().setSession(getGestorDao().getSession());
		getComprasdao().cargaCuentasByUsuario(cuentas, usuario);
		
	}

	public ComprasDao getComprasdao()
	{
		return comprasdao;
	}

	public void setComprasdao(ComprasDao comprasdao)
	{
		this.comprasdao = comprasdao;
	}

	

	

	

}
