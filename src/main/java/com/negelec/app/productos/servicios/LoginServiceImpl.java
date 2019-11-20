package com.negelec.app.productos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.negelec.app.productos.entity.Usuario;
import com.negelec.app.productos.mapper.UsuarioMapper;
import com.negelec.app.productos.model.UsuarioModel;
import com.negelec.app.productos.repository.ILoginDAO;
import com.negelec.app.productos.servicios.Impl.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private ILoginDAO loginRepo;
	@Autowired
	private PasswordEncoder encoder;
	@Autowired
	private UsuarioMapper mapper;
	@Override
	public boolean login(UsuarioModel usuarioModel) {
		List<Usuario> usuarios = loginRepo.findByNombreusuario(usuarioModel.getUsuario());
		for(Usuario usuario : usuarios) {
			if(encoder.matches(usuarioModel.getClave(), usuario.getClaveusuario()))
				return true;
		}
		return false;
	}

	@Override
	public boolean registro(UsuarioModel usuarioModel) {
		return loginRepo.save(mapper.modelToEntity(usuarioModel)) != null ? true : false;
	}

}
