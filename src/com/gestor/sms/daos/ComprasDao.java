package com.gestor.sms.daos;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.gestor.sms.datos.Compra;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;

@Repository
public class ComprasDao extends GestorDao
{

	

	
	public void cargaCuentasByUsuario(List<Cuenta> cuentas, Usuario usuario) throws Exception
	{
		Criteria criteria= getSession().createCriteria(Cuenta.class);
		criteria.add(Restrictions.in("usuarios", usuario));
		List resultado=criteria.list();
		cuentas.addAll(resultado);
		
	}

	public void grabaCompra(Compra compra) throws Exception
	{
		getSession().saveOrUpdate(compra);
		
	}
	

}
