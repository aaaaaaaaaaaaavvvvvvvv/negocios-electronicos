package com.negelec.app.productos.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "cab_compra")
public class CabeceraCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigocompra;
	@ManyToOne
	@JoinColumn(name = "codigousuario", referencedColumnName = "codigousuario")
	private Usuario usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCompra;
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
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
}
