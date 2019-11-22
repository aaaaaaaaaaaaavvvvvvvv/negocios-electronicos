package com.negelec.app.productos.mapper;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.UsuarioModel;
@Component
public class UsuarioMapper {
	@Autowired
	private PasswordEncoder encoder;

	public Usuario modelToEntity(UsuarioModel model) {
		Usuario entity = new Usuario();
		entity.setNombreusuario(model.getUsuario());
		entity.setClaveusuario(encoder.encode(model.getClave()));
		entity.setFechacreacionusuario(new Date());
		entity.setSaldo(model.getSaldo());
		return entity;
	}
}
