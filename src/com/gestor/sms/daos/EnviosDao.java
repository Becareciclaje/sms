package com.gestor.sms.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.servicios.EnviosServiceInterface;

@Repository
public class EnviosDao extends GestorDao
{

	public void dameDestinatarios(List<Destinatario> destinatarios, int id) throws Exception
	{
		Criteria criteria= getSession().createCriteria(Destinatario.class); 
		destinatarios = criteria.list();
	}


}
