package com.negelec.app.productos.servicios.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.model.UsuarioModel;
import com.negelec.app.productos.repository.ILoginDAO;
import com.negelec.app.productos.servicios.IUsuarioService;
@Service
public class UsuarioServiceImpl implements IUsuarioService {
	@Autowired
	private ILoginDAO usuarioRepo;

	@Override
	public Usuario actualizarSaldo(UsuarioModel usuarioModel) {
		Optional<Usuario> usuarioOpt = usuarioRepo.findById(usuarioModel.getCodigoUsuario());
		if (usuarioOpt.isPresent()) {
			Usuario usuario = usuarioOpt.get();
			usuario.setSaldo(usuarioModel.getSaldo());
			return usuarioRepo.save(usuario);
		} else {
			return null;
		}
	}

	@Override
	public Usuario actualizarCodigoCelular(UsuarioModel usuarioModel) {
		Optional<Usuario> usuarioOpt = usuarioRepo.findById(usuarioModel.getCodigoUsuario());
		if (usuarioOpt.isPresent()) {
			Usuario usuario = usuarioOpt.get();
			usuario.setCodigocelular(usuarioModel.getCodigoCelular());
			return usuarioRepo.save(usuario);
		} else {
			return null;
		}
	}

}
