package com.gestor.sms.daos;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gestor.sms.datos.Cuenta;


public class ComprasDao extends GestorDao
{

	@SuppressWarnings("unchecked")
	public void dameCuentas(List<Cuenta> cuentas, int id)
	{
		//Criteria criteria=getSession().createCriteria(Cuenta.class);
		Query criteria=getSession().createQuery("from Cuenta c");
		//criteria.add(Restrictions.eq("id", id));
		List<Cuenta> c=criteria.list();
		
		cuentas=c;
		
	}
	

}
