package com.negelec.app.productos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.negelec.app.productos.entity.Producto;
import com.negelec.app.productos.repository.IProductosDAO;

@Service
public class ProductosServiceImpl implements IProductosService{

	@Autowired
	private IProductosDAO productoDAO; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return productoDAO.findAll();
	}

}
