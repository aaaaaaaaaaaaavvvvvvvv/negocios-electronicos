package com.negelec.app.productos.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigorol;
	private String nombrerol;
	@JsonIgnore
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;
	public Integer getCodigorol() {
		return codigorol;
	}
	public void setCodigorol(Integer codigorol) {
		this.codigorol = codigorol;
	}
	public String getNombrerol() {
		return nombrerol;
	}
	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
