package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigousuariorol;
	@ManyToOne
	@JoinColumn(name = "codigousuario", referencedColumnName = "codigousuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "codigorol", referencedColumnName = "codigorol")
	private Rol rol;
	public Integer getCodigousuariorol() {
		return codigousuariorol;
	}
	public void setCodigousuariorol(Integer codigousuariorol) {
		this.codigousuariorol = codigousuariorol;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
