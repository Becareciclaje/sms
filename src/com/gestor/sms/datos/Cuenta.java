package com.gestor.sms.datos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cuentas database table.
 * 
 */
@Entity
@Table(name="cuentas")
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private byte autorizado;

	private String mail;

	private String nif;

	private String nombre;

	private String remitente;

	private int telefono;

	private String tipoContrato;

	//bi-directional many-to-one association to Compra
	@OneToMany(mappedBy="cuenta")
	private List<Compra> compras;

	//bi-directional many-to-one association to Destinatario
	@OneToMany(mappedBy="cuenta")
	private List<Destinatario> destinatarios;

	//bi-directional many-to-one association to Envio
	@OneToMany(mappedBy="cuenta")
	private List<Envio> envios;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="cuentas")
	private List<Usuario> usuarios;

	public Cuenta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAutorizado() {
		return this.autorizado;
	}

	public void setAutorizado(byte autorizado) {
		this.autorizado = autorizado;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRemitente() {
		return this.remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public Compra addCompra(Compra compra) {
		getCompras().add(compra);
		compra.setCuenta(this);

		return compra;
	}

	public Compra removeCompra(Compra compra) {
		getCompras().remove(compra);
		compra.setCuenta(null);

		return compra;
	}

	public List<Destinatario> getDestinatarios() {
		return this.destinatarios;
	}

	public void setDestinatarios(List<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}

	public Destinatario addDestinatario(Destinatario destinatario) {
		getDestinatarios().add(destinatario);
		destinatario.setCuenta(this);

		return destinatario;
	}

	public Destinatario removeDestinatario(Destinatario destinatario) {
		getDestinatarios().remove(destinatario);
		destinatario.setCuenta(null);

		return destinatario;
	}

	public List<Envio> getEnvios() {
		return this.envios;
	}

	public void setEnvios(List<Envio> envios) {
		this.envios = envios;
	}

	public Envio addEnvio(Envio envio) {
		getEnvios().add(envio);
		envio.setCuenta(this);

		return envio;
	}

	public Envio removeEnvio(Envio envio) {
		getEnvios().remove(envio);
		envio.setCuenta(null);

		return envio;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}