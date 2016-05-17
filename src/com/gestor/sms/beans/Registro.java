package com.gestor.sms.beans;

import java.io.Serializable;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;

public class Registro implements Serializable
{
	private Usuario usuario;
	private Cuenta cuenta;
	public Usuario getUsuario()
	{
		return usuario;
	}
	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
	public Cuenta getCuenta()
	{
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta)
	{
		this.cuenta = cuenta;
	}

}
