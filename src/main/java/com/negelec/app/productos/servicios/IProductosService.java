package com.negelec.app.productos.servicios;

import java.util.List;

import com.negelec.app.productos.entity.Producto;

public interface IProductosService {
	
	public List<Producto> findAll();
}
