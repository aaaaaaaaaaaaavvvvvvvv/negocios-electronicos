package com.negelec.app.productos.servicios;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.UsuarioModel;

public interface ILoginService {
	public Usuario login(UsuarioModel usuarioModel);
	public Usuario registro(UsuarioModel usuarioModel);
}
