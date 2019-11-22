package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "compra_detalle")
public class DetalleCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigodetallecompra;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "codigocompra", referencedColumnName = "codigocompra")
	private CabeceraCompra compra;
	@ManyToOne
	@JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto")
	private Producto producto;
	private Integer cantidad;

	public Integer getCodigodetallecompra() {
		return codigodetallecompra;
	}

	public void setCodigodetallecompra(Integer codigodetallecompra) {
		this.codigodetallecompra = codigodetallecompra;
	}

	public CabeceraCompra getCompra() {
		return compra;
	}

	public void setCompra(CabeceraCompra compra) {
		this.compra = compra;
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
