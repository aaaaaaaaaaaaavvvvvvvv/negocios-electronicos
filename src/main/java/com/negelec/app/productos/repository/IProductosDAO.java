package com.negelec.app.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.negelec.app.productos.entity.Producto;

public interface IProductosDAO extends JpaRepository<Producto,Integer>{

}
