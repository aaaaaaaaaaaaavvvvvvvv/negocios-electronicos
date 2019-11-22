package com.negelec.app.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.negelec.app.productos.entity.CabeceraCompra;
@Repository
public interface ICabeceraCompraDAO extends JpaRepository<CabeceraCompra, Integer>{
	@Query(value = "SELECT cc FROM cabeceraCompra cc WHERE cc.usuario.codigousuario = :codigousuario")
	public List<CabeceraCompra> findPorCodigousuario(@Param("codigousuario") int codigoUsuario);
}
