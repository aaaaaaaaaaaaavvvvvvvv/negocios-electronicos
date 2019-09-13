package com.negelec.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.entity.Producto;
import com.negelec.app.productos.servicios.IProductosService;

@RestController
public class VentasController {

	@Autowired
	private IProductosService productoServicio;
	
	@GetMapping("/lista-productos")
	public List<Producto> listarProductos() {
		return productoServicio.findAll();
	}
}
