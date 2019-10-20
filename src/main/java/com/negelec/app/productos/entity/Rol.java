package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigorol;
	private String nombrerol;
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
	
	
}
