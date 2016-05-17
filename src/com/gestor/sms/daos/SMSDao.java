package com.gestor.sms.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;

public class SMSDao extends GestorDao
{
	public void verUsuario(Usuario usuario) throws  Exception
	{
		List<Usuario> usuarios= new ArrayList<>();
		try
		{
			Criteria criteria= getSession().createCriteria(Usuario.class);
			criteria.add(Restrictions.eq("login", usuario.getLogin()));
			criteria.add(Restrictions.eq("clave", usuario.getClave()));
			usuarios=criteria.list();
		} catch (Exception e)
		{
			throw e;
		}
		if(usuarios.size()>0)
			throw new UsuarioExisteException();
		
	}

}
