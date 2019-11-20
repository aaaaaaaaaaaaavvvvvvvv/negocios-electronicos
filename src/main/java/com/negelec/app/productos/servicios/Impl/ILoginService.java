package com.negelec.app.productos.servicios.Impl;

import com.negelec.app.productos.model.UsuarioModel;

public interface ILoginService {
	public boolean login(UsuarioModel usuarioModel);
	public boolean registro(UsuarioModel usuarioModel);
}
