package com.negelec.app.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.negelec.app.productos.entity.Usuario;
@Repository
public interface ILoginDAO extends JpaRepository<Usuario,Integer> {
	public List<Usuario> findByNombreusuario(String nombreusuario);
}
