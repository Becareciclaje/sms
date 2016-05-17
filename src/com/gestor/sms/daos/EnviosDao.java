package com.gestor.sms.daos;

import java.util.List;

import org.hibernate.Criteria;

import com.gestor.sms.datos.Destinatario;

public class EnviosDao extends GestorDao
{

	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception
	{
		Criteria criteria= getSession().createCriteria(Destinatario.class); 
		destinatarios = criteria.list();
	}
	


}
