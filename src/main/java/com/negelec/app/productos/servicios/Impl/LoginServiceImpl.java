package com.negelec.app.productos.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.mapper.UsuarioMapper;
import com.negelec.app.productos.model.UsuarioModel;
import com.negelec.app.productos.repository.ILoginDAO;
import com.negelec.app.productos.servicios.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private ILoginDAO loginRepo;
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private UsuarioMapper mapper;
	@Override
	public Usuario login(UsuarioModel usuarioModel) {
		List<Usuario> usuarios = loginRepo.findByNombreusuario(usuarioModel.getUsuario());
		for(Usuario usuario : usuarios) {
			if(encoder.matches(usuarioModel.getClave(), usuario.getClaveusuario()))
				return usuario;
		}
		return null;
	}

	@Override
	public Usuario registro(UsuarioModel usuarioModel) {
		return loginRepo.save(mapper.modelToEntity(usuarioModel));
	}

}
