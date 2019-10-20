package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrito_detalle")
public class DetalleCarrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigocarritodetalle;
	@ManyToOne
	@JoinColumn(name = "codigocarrito", referencedColumnName = "codigocarrito")
	private Carrito carrito;
	@ManyToOne
	@JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto")
	private Producto producto;
	private Integer cantidad;
	public Integer getCodigocarritodetalle() {
		return codigocarritodetalle;
	}
	public void setCodigocarritodetalle(Integer codigocarritodetalle) {
		this.codigocarritodetalle = codigocarritodetalle;
	}
	public Carrito getCarrito() {
		return carrito;
	}
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
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
