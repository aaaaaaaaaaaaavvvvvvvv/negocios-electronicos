package com.negelec.app.productos.model;

public class UsuarioModel {
	private int codigoUsuario;
	private String usuario;
	private String clave;
	private float saldo;
	private String codigoCelular;

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getCodigoCelular() {
		return codigoCelular;
	}

	public void setCodigoCelular(String codigoCelular) {
		this.codigoCelular = codigoCelular;
	}

}
