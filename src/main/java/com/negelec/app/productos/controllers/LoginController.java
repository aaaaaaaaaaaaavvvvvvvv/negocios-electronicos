package com.negelec.app.productos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.model.UsuarioModel;
import com.negelec.app.productos.servicios.Impl.ILoginService;

@RestController
@CrossOrigin
public class LoginController {
	@Autowired
	private ILoginService loginService;

	@PostMapping("/login")
	public boolean login(@RequestBody UsuarioModel usuarioModel) {
		return loginService.login(usuarioModel);
	}

	@PostMapping("/registro")
	public boolean registro(@RequestBody UsuarioModel usuarioModel) {
		return loginService.registro(usuarioModel);
	}
}
