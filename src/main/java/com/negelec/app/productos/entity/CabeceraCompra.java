package com.negelec.app.productos.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity(name = "cabeceraCompra")
@Table(name = "cab_compra")
public class CabeceraCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigocompra;
	@ManyToOne
	@JoinColumn(name = "codigousuario", referencedColumnName = "codigousuario")
	private Usuario usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechacompra;
	@OneToMany(mappedBy = "compra")
	private List<DetalleCompra> detalle;
	
	public Integer getCodigocompra() {
		return codigocompra;
	}
	public void setCodigocompra(Integer codigocompra) {
		this.codigocompra = codigocompra;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getFechacompra() {
		return fechacompra;
	}
	public void setFechacompra(Date fechacompra) {
		this.fechacompra = fechacompra;
	}
	public List<DetalleCompra> getDetalle() {
		return new ArrayList<DetalleCompra>(detalle);
	}
	public void setDetalle(List<DetalleCompra> detalle) {
		this.detalle = detalle;
	}
	
}
