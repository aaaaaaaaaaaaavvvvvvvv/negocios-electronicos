package com.negelec.app.productos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigousuario;
	private String nombreusuario;
	private String claveusuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacionusuario;

	@OneToMany(mappedBy = "usuario")
	private List<UsuarioRol> roles;

	public Integer getCodigousuario() {
		return codigousuario;
	}

	public void setCodigousuario(Integer codigousuario) {
		this.codigousuario = codigousuario;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getClaveusuario() {
		return claveusuario;
	}

	public void setClaveusuario(String claveusuario) {
		this.claveusuario = claveusuario;
	}

	public Date getFechacreacionusuario() {
		return fechacreacionusuario;
	}

	public void setFechacreacionusuario(Date fechacreacionusuario) {
		this.fechacreacionusuario = fechacreacionusuario;
	}

	public List<UsuarioRol> getRoles() {
		return roles;
	}

	public void setRoles(List<UsuarioRol> roles) {
		this.roles = roles;
	}
}
