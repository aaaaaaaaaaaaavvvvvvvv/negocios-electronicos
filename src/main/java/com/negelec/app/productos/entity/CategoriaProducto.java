package com.negelec.app.productos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "categoria_producto")
public class CategoriaProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigocategoriaproducto;
	@ManyToOne
	@JoinColumn(name = "codigocategoria", referencedColumnName = "codigocategoria")
	private Categoria categoria;
	@ManyToOne
	@JoinColumn(name = "codigoproducto", referencedColumnName = "codigoproducto")
	private Producto producto;

	public Integer getCodigocategoriaproducto() {
		return codigocategoriaproducto;
	}

	public void setCodigocategoriaproducto(Integer codigocategoriaproducto) {
		this.codigocategoriaproducto = codigocategoriaproducto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
