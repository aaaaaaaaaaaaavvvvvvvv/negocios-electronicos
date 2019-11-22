package com.negelec.app.productos.servicios;

import java.util.List;

import com.negelec.app.productos.entity.CabeceraCompra;
import com.negelec.app.productos.model.CabeceraCompraModel;

public interface ICompraService {
	public boolean agregarCompra(CabeceraCompraModel compra);
	public List<CabeceraCompra> recuperarCompras(int codigousuario);	
}
