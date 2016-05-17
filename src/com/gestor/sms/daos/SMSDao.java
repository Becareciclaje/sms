package com.gestor.sms.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;

import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;

public class SMSDao extends GestorDao
{
	public void verUsuario(Usuario usuario) throws  Exception
	{
		List<Usuario> usuarios= new ArrayList<>();
		try
		{
			cargaEntidadWithFilterProperty(usuarios, Usuario.class, "login", usuario.getLogin());
		} catch (Exception e)
		{
			throw e;
		}
		if(usuario!=null)
			throw new Exception();
		
	}

}
