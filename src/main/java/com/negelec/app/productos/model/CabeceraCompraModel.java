package com.negelec.app.productos.model;

import java.util.List;

public class CabeceraCompraModel {
	private int codigousuario;
	private List<DetalleCompraModel> detalleCarrito;
	public int getCodigoUsuario() {
		return codigousuario;
	}
	public void setCodigoUsuario(int codigousuario) {
		this.codigousuario = codigousuario;
	}
	public List<DetalleCompraModel> getDetalleCarrito() {
		return detalleCarrito;
	}
	public void setDetalleCarrito(List<DetalleCompraModel> detalleCarrito) {
		this.detalleCarrito = detalleCarrito;
	}
}
