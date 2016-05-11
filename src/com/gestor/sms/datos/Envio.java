package com.gestor.sms.datos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the envios database table.
 * 
 */
@Entity
@Table(name="envios")
@NamedQuery(name="Envio.findAll", query="SELECT e FROM Envio e")
public class Envio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_envio")
	private Date fechaEnvio;

	@Column(name="indiicador_envio")
	private String indiicadorEnvio;

	private String telefono;

	private String textoSMS;

	//bi-directional many-to-one association to Cuenta
	@ManyToOne
	@JoinColumn(name="cuentas_id")
	private Cuenta cuenta;

	public Envio() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFechaEnvio() {
		return this.fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public String getIndiicadorEnvio() {
		return this.indiicadorEnvio;
	}

	public void setIndiicadorEnvio(String indiicadorEnvio) {
		this.indiicadorEnvio = indiicadorEnvio;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTextoSMS() {
		return this.textoSMS;
	}

	public void setTextoSMS(String textoSMS) {
		this.textoSMS = textoSMS;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}