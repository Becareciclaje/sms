package com.gestor.sms.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
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

}
