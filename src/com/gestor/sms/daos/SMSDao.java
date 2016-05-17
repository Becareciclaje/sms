package com.gestor.sms.daos;

import java.util.List;

import org.hibernate.Criteria;

import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;

public class SMSDao extends GestorDao
{
	public void verUsuario(Usuario usuario) throws Exception
	{
		List<Usuario> usuarios= null;
		cargaEntidadWithFilterProperty(usuarios, Usuario.class, "login", usuario.getLogin());
		if(usuario!=null)
			throw new UsuarioExisteException();
		
	}

}
