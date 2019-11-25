package com.negelec.app.productos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.UsuarioModel;
import com.negelec.app.productos.servicios.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioService usuarioService;
	
	/*
	 * @Input: codigoUsuario, saldo
	*/
	@PutMapping("/actualizarSaldo")
	public Usuario actualizarSaldo(@RequestBody UsuarioModel usuarioModel) {
		return usuarioService.actualizarSaldo(usuarioModel);
	}
	/*
	 * @Input: codigoUsuario, codigoCelular
	*/
	@PutMapping("/actualizarCodigoCelular")
	public Usuario actualizarCodigoCelular(@RequestBody UsuarioModel usuarioModel) {
		return usuarioService.actualizarCodigoCelular(usuarioModel);
	}
}
