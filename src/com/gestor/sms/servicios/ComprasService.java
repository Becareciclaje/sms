package com.gestor.sms.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.anotaciones.TransactionManager;
import com.gestor.sms.daos.ComprasDao;
import com.gestor.sms.datos.Compra;
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
	
	@TransactionManager
	public void grabaCompra(Compra compra) throws Exception
	{
		
		
		getComprasdao().setSession(getGestorDao().getSession());
		getComprasdao().grabaCompra( compra);
		
	}

	private void invocarPorReflection(ComprasDao comprasdao2, String cuenta, String cantidad)
	{
		// TODO Auto-generated method stub
		
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
