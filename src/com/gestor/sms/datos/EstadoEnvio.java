package com.gestor.sms.datos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the estado_envio database table.
 * 
 */
@Entity
@Table(name="estado_envio")
@NamedQuery(name="EstadoEnvio.findAll", query="SELECT e FROM EstadoEnvio e")
public class EstadoEnvio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name="`id INT`")
	private String id_INT;

	public EstadoEnvio() {
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getId_INT() {
		return this.id_INT;
	}

	public void setId_INT(String id_INT) {
		this.id_INT = id_INT;
	}

}