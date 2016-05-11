package com.gestor.sms.datos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the destinatarios database table.
 * 
 */
@Entity
@Table(name="destinatarios")
@NamedQuery(name="Destinatario.findAll", query="SELECT d FROM Destinatario d")
public class Destinatario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String nombre;

	private int telefono;

	//bi-directional many-to-one association to Cuenta
	@ManyToOne
	@JoinColumn(name="cuentas_id")
	private Cuenta cuenta;

	public Destinatario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}