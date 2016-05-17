package com.gestor.sms.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


public class GestorDao
{
	@Autowired
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	public SessionFactory getFactory()
	{
		return factory;
	}
	public Session getSession()
	{
		return session;
	}
	public Transaction getTransaction()
	{
		return transaction;
	}
	public void setFactory(SessionFactory factory)
	{
		this.factory = factory;
	}
	public void setSession(Session session)
	{
		this.session = session;
	}
	public void setTransaction(Transaction transaction)
	{
		this.transaction = transaction;
	}
	public void cargaEntidadWithFilterProperty(List<?> datos, Class<?> clase, String property, Object value) throws Exception
	{
		Criteria criteria=getSession().createCriteria(clase);
		criteria.add(Restrictions.eq(property, value));
		datos=criteria.list();
		
	}
	
	public void grabaDato(Object objeto)
	{
		getSession().saveOrUpdate(objeto);
	}

}
