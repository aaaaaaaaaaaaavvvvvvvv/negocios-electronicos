package com.negelec.app.productos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.UsuarioModel;
import com.negelec.app.productos.servicios.ILoginService;

@RestController
@CrossOrigin
public class LoginController {
	@Autowired
	private ILoginService loginService;
	
	/*
	 * @Input: usuario, clave, saldo(opcional) 
	*/
	@PostMapping("/login")
	public Usuario login(@RequestBody UsuarioModel usuarioModel) {
		System.out.println("MOSTRANDO");
		System.out.println(usuarioModel.getClave());
		return loginService.login(usuarioModel);
	}

	@PostMapping("/registro")
	public Usuario registro(@RequestBody UsuarioModel usuarioModel) {
		return loginService.registro(usuarioModel);
	}
}
