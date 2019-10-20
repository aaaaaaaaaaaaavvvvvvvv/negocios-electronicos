package com.negelec.app.productos.entity;

import javax.persistence.*;


@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigoproducto;
	private String nombreproducto;
	private String descripcionproducto;
	private float precioproducto; 
	private String urlfoto;
	
	public Integer getCodigoproducto() {
		return codigoproducto;
	}
	public void setCodigoproducto(Integer codigoproducto) {
		this.codigoproducto = codigoproducto;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getDescripcionproducto() {
		return descripcionproducto;
	}
	public void setDescripcionproducto(String descripcionproducto) {
		this.descripcionproducto = descripcionproducto;
	}
	public float getPrecioproducto() {
		return precioproducto;
	}
	public void setPrecioproducto(float precioproducto) {
		this.precioproducto = precioproducto;
	}
	public String getUrlfoto() {
		return urlfoto;
	}
	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}
	
	
}
