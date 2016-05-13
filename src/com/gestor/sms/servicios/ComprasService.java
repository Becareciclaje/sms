package com.gestor.sms.servicios;

import java.util.List;

import javax.xml.ws.WebServiceClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestor.sms.anotaciones.SessionManager;
import com.gestor.sms.daos.ComprasDao;
import com.gestor.sms.datos.Cuenta;

@Service
public class ComprasService extends GestorService implements ComprasServiceInterface
{
	@Autowired
	private ComprasDao cuentasDao;

	@Override
	@SessionManager
	public void dameCuentas(List<Cuenta> cuentas, int id) throws Exception
	{
		getCuentasDao().dameCuentas(cuentas, id);

	}

	public ComprasDao getCuentasDao()
	{
		return cuentasDao;
	}

	public void setCuentasDao(ComprasDao cuentasDao)
	{
		this.cuentasDao = cuentasDao;
	}

}
