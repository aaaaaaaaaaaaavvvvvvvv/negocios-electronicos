package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigocarrito;
	@ManyToOne
	@JoinColumn(name = "codigousuario", referencedColumnName = "codigousuario")
	private Usuario usuario;
	@ManyToOne
	@JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto")
	private Producto producto;
	private Integer cantidad;
	public Integer getCodigocarrito() {
		return codigocarrito;
	}
	public void setCodigocarrito(Integer codigocarrito) {
		this.codigocarrito = codigocarrito;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
