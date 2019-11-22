package com.negelec.app.productos.mapper;

import com.negelec.app.productos.entity.CabeceraCompra;
import com.negelec.app.productos.entity.DetalleCompra;
import com.negelec.app.productos.entity.Producto;
import com.negelec.app.productos.model.DetalleCompraModel;

public class DetalleCompraMapper {
	public static DetalleCompra fromModelToEntity(DetalleCompraModel model, int codigoCabecera) {
		DetalleCompra  entity = new DetalleCompra();
		
		CabeceraCompra cabeceraCompra = new CabeceraCompra();
		cabeceraCompra.setCodigocompra(codigoCabecera);
		
		Producto producto = new Producto();
		producto.setCodigoproducto(model.getCodigoproducto());
		
		entity.setCompra(cabeceraCompra);
		entity.setProducto(producto);
		entity.setCantidad(model.getCantidad());
		
		return entity;
	}
}
