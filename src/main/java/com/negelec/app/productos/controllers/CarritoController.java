package com.negelec.app.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negelec.app.productos.entity.CabeceraCompra;
import com.negelec.app.productos.model.CabeceraCompraModel;
import com.negelec.app.productos.servicios.ICompraService;

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
	@PostMapping("/recupera")	//Recupera
	public List<CabeceraCompra> recuperarCompra(@RequestBody CabeceraCompraModel compra) {	//Sólo necesito el codigousuario 
		return compraService.recuperarCompras(compra.getCodigousuario());
	}
	
}
