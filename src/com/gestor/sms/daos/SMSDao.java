package com.gestor.sms.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;

import com.gestor.sms.beans.Registro;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;

public class SMSDao extends GestorDao {
	public void verUsuario(Usuario usuario) throws Exception {
		List<Usuario> usuarios = new ArrayList<>();
		try {
			Criteria criteria = getSession().createCriteria(Usuario.class);
			
			criteria.add(Restrictions.eq("login", usuario.getLogin()));
			criteria.add(Restrictions.eq("clave", usuario.getClave()));
			usuarios = criteria.list();
		} catch (Exception e) {
			throw e;
		}
		if (usuarios.size() > 0)
		{
			System.out.println(usuarios.get(0).getRoles().get(0).getRol());

			usuario.setRoles(usuarios.get(0).getRoles());
			throw new UsuarioExisteException();
		}

	}

	public void registro(Registro registro) throws UsuarioExisteException {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(Usuario.class);
		criteria.add(Restrictions.eq("login", registro.getUsuario().getLogin()));

		if (!criteria.list().isEmpty())

			throw new UsuarioExisteException();
		else
			getSession().saveOrUpdate(registro);
		    

	}

}
