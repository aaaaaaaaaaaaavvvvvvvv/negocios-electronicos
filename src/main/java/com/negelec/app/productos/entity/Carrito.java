package com.negelec.app.productos.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "carrito")
	private List<DetalleCarrito> detalle;
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
	public List<DetalleCarrito> getDetalle() {
		return new ArrayList<DetalleCarrito>(detalle);
	}
	public void setDetalle(List<DetalleCarrito> detalle) {
		this.detalle = detalle;
	}
}
