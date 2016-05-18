package com.gestor.sms.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.datos.Usuario;

public class EnviosDao extends GestorDao
{

	public void dameDestinatarios(List<Cuenta> cuentas, int id) throws Exception
	{
		cargaEntidadWithFilterProperty(cuentas, Cuenta.class, "id", id);
//		Criteria criteria= getSession().createCriteria(Destinatario.class); 
//		destinatarios = criteria.list();
	}

	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario)
	{
		Criteria criteria= getSession().createCriteria(Cuenta.class);
		criteria.add(Restrictions.in("usuarios", usuario));
		List resultado=criteria.list();
		cuentas.addAll(resultado);
	}
	

	public void seleccionar(List<Destinatario> destinatarios) throws Exception
	{
		for (Destinatario destinatario : destinatarios)
		{
			grabaDato(destinatario);
		}
	}

}
