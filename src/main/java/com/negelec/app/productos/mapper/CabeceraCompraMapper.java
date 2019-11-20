package com.negelec.app.productos.mapper;

import java.util.Date;

import com.negelec.app.productos.entity.CabeceraCompra;
import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.CabeceraCompraModel;

public class CabeceraCompraMapper {
	public static CabeceraCompra fromModelToEntity(CabeceraCompraModel model) {
		CabeceraCompra entity = new CabeceraCompra();
		Usuario usuario = new Usuario();
		usuario.setCodigousuario(model.getCodigoUsuario());
		
		entity.setUsuario(usuario);
		entity.setFechaCompra(new Date());
		
		return entity;
	}
}
