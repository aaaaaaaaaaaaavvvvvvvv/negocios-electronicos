package com.negelec.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.entity.Producto;
import com.negelec.app.productos.model.DeleteModel;
import com.negelec.app.productos.servicios.IProductosService;

@RestController
@RequestMapping("/productos")
@CrossOrigin
public class ProductosController {

	@Autowired
	private IProductosService productoServicio;
	
	@GetMapping					//Enlista
	public List<Producto> listarProductos() {
		return productoServicio.findAll();
	}
	@GetMapping("/{id}")		//Busca uno
	public Producto buscarProducto(@PathVariable(name = "id",required = true) String id) {
		return productoServicio.findOne(id);
	}
	@PostMapping				//Agrega
	public boolean agregarProducto(@RequestBody Producto producto) {
		return productoServicio.add(producto);
	}
	@PutMapping 				//Actualiza
	public boolean actualizaProducto(@RequestBody Producto producto) {
		return productoServicio.updateOne(producto);
	}
	@DeleteMapping				//Actualiza
	public boolean borraProducto(@RequestBody DeleteModel deleteModel) {
		return productoServicio.deleteOne(deleteModel.getCodigo());
	}
	
	
}
