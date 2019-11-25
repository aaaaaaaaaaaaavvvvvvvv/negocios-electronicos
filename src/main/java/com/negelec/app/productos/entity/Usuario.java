package com.negelec.app.productos.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigousuario;
	private String nombreusuario;
	private String claveusuario;
	private float saldo;
	@JsonIgnore
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacreacionusuario;
	@JsonIgnore
	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "codigousuario"), inverseJoinColumns = @JoinColumn(name = "codigorol"))
	@ManyToMany
	private List<Rol> roles;
	private String codigocelular;

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

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Date getFechacreacionusuario() {
		return fechacreacionusuario;
	}

	public void setFechacreacionusuario(Date fechacreacionusuario) {
		this.fechacreacionusuario = fechacreacionusuario;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	public String getCodigocelular() {
		return codigocelular;
	}

	public void setCodigocelular(String codigocelular) {
		this.codigocelular = codigocelular;
	}

}
