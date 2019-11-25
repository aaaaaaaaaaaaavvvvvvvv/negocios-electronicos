package com.negelec.app.productos.servicios;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.UsuarioModel;

public interface IUsuarioService {
	public Usuario actualizarSaldo(UsuarioModel usuarioModel);
	public Usuario actualizarCodigoCelular(UsuarioModel usuarioModel);
}
