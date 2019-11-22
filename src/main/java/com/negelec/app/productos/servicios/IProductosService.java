package com.negelec.app.productos.servicios;

import java.util.List;

import com.negelec.app.productos.entity.Producto;

public interface IProductosService {
	public List<Producto> findAll();
	public Producto findOne(String codigoProducto);
	public boolean add(Producto producto);
	public boolean deleteOne(String codigoProducto);
	public boolean updateOne (Producto producto);
}
