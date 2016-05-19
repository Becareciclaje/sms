package com.gestor.sms.datos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String clave;

	private String login;

	//bi-directional many-to-many association to Cuenta
	@ManyToMany
	
	@JoinTable(
		name="cuentas_has_usuarios"
		, joinColumns={
			@JoinColumn(name="usuarios_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="cuentas_id")
			}
		)
	private List<Cuenta> cuentas;

	//bi-directional many-to-many association to Role
	@ManyToMany
	
	@JoinTable(
		name="usuarios_has_roles"
		, joinColumns={
			@JoinColumn(name="usuario_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="roles_id")
			}
		)
	private List<Role> roles;

	public Usuario() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Cuenta> getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}