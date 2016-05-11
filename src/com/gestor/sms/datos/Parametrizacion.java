package com.gestor.sms.datos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the parametrizacion database table.
 * 
 */
@Entity
@NamedQuery(name="Parametrizacion.findAll", query="SELECT p FROM Parametrizacion p")
public class Parametrizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="`id INT`")
	private int id_INT;

	@Column(name="envios_alerta")
	private int enviosAlerta;

	@Column(name="hora_desde")
	private Time horaDesde;

	@Column(name="hora_hasta")
	private Time horaHasta;

	@Column(name="precio_sms")
	private int precioSms;

	public Parametrizacion() {
	}

	public int getId_INT() {
		return this.id_INT;
	}

	public void setId_INT(int id_INT) {
		this.id_INT = id_INT;
	}

	public int getEnviosAlerta() {
		return this.enviosAlerta;
	}

	public void setEnviosAlerta(int enviosAlerta) {
		this.enviosAlerta = enviosAlerta;
	}

	public Time getHoraDesde() {
		return this.horaDesde;
	}

	public void setHoraDesde(Time horaDesde) {
		this.horaDesde = horaDesde;
	}

	public Time getHoraHasta() {
		return this.horaHasta;
	}

	public void setHoraHasta(Time horaHasta) {
		this.horaHasta = horaHasta;
	}

	public int getPrecioSms() {
		return this.precioSms;
	}

	public void setPrecioSms(int precioSms) {
		this.precioSms = precioSms;
	}

}