package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigocategoria;
	private String nombrecategoria;
	private String descripcioncategoria;
	public Integer getCodigocategoria() {
		return codigocategoria;
	}
	public void setCodigocategoria(Integer codigocategoria) {
		this.codigocategoria = codigocategoria;
	}
	public String getNombrecategoria() {
		return nombrecategoria;
	}
	public void setNombrecategoria(String nombrecategoria) {
		this.nombrecategoria = nombrecategoria;
	}
	public String getDescripcioncategoria() {
		return descripcioncategoria;
	}
	public void setDescripcioncategoria(String descripcioncategoria) {
		this.descripcioncategoria = descripcioncategoria;
	}
}
