package com.gestor.sms.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
		List<Usuario> users = new ArrayList<>();
		users.add(usuario);
		// Criteria criteria= getSession().createCriteria(Cuenta.class);
		// criteria.add(Restrictions.isNotNull("usuarios")).
		// criteria.add(Restrictions.in("usuarios", users));
		SQLQuery query = getSession().createSQLQuery(
				"select * from cuentas where id in (select cuentas_id from cuentas_has_usuarios where usuarios_id=1)");
		List resultado = query.list();
		if (cuentas == null)
			cuentas = new ArrayList<>();
		for (Object object : resultado)
		{
			Object[] dato = (Object[]) object;
			Cuenta c = new Cuenta();
			c.setId((int) dato[0]);
			c.setNombre((String) dato[1]);
			c.setNif((String) dato[2]);
			c.setTipoContrato((String) dato[3]);
			c.setTelefono((int) dato[4]);
			c.setMail((String) dato[5]);
			boolean valor = (boolean) dato[6];
			byte aut = 0;
			if (valor)
				aut = 1;
			c.setAutorizado(aut);
			c.setRemitente((String) dato[7]);
			c.setDireccion((String) dato[8]);
			c.setCodigoPostal((String) dato[9]);
			c.setPoblacion((String) dato[10]);
			c.setProvincia((String) dato[11]);
			cuentas.add(c);

		}
	}

	public void grabaCompra(Compra compra) throws Exception
	{
		getSession().saveOrUpdate(compra);

	}

	public void getListaCompras(Cuenta cuenta, List<Compra> compras) throws Exception
	{
		Cuenta cuenta2= getSession().load(Cuenta.class, cuenta.getId()); 
		Criteria criteria=getSession().createCriteria(Compra.class);
		criteria.add(Restrictions.eq("cuenta", cuenta2));
		compras.addAll(criteria.list());
		
	}

}
