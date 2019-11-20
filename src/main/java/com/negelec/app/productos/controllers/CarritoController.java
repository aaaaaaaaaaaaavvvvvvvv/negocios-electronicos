package com.negelec.app.productos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.model.CabeceraCompraModel;
import com.negelec.app.productos.servicios.Impl.ICompraService;

@RestController
@RequestMapping("/carrito")
@CrossOrigin
public class CarritoController {
	@Autowired
	private ICompraService compraService;
	@PostMapping				//Agrega
	public boolean agregarCompra(@RequestBody CabeceraCompraModel compra) {
		return compraService.agregarCompra(compra);
	}
}
