package com.gestor.sms.beans;

import java.util.List;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Destinatario;

public class Envio
{
private Cuenta cuenta;
private List<Cuenta> cuentas;
private List<Destinatario> destinatarios;
public Cuenta getCuenta()
{
	return cuenta;
}
public void setCuenta(Cuenta cuenta)
{
	this.cuenta = cuenta;
}
public List<Cuenta> getCuentas()
{
	return cuentas;
}
public void setCuentas(List<Cuenta> cuentas)
{
	this.cuentas = cuentas;
}
public List<Destinatario> getDestinatarios()
{
	return destinatarios;
}
public void setDestinatarios(List<Destinatario> destinatarios)
{
	this.destinatarios = destinatarios;
}
}
