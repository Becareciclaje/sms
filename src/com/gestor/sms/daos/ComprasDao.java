package com.gestor.sms.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gestor.sms.datos.Cuenta;

@Repository
public class ComprasDao extends GestorDao
{

	public void dameCuentas(List<Cuenta> cuentas, int id)
	{
		Criteria criteria=getSession().createCriteria(Cuenta.class);
		
		//criteria.add(Restrictions.eqOrIsNull("id", id));
		
		cuentas=criteria.list();
		
	}
	

}
