package com.negelec.app.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.negelec.app.productos.entity.CabeceraCompra;
@Repository
public interface ICabeceraCompraDAO extends JpaRepository<CabeceraCompra, Integer>{

}
