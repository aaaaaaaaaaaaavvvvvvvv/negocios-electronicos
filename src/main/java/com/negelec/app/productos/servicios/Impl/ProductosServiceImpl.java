package com.negelec.app.productos.servicios.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.negelec.app.productos.entity.Producto;
import com.negelec.app.productos.repository.IProductosDAO;
import com.negelec.app.productos.servicios.IProductosService;

@Service
public class ProductosServiceImpl implements IProductosService{

	@Autowired
	private IProductosDAO productoDAO; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return productoDAO.findAll();
	}

	@Override
	public Producto findOne(String codigoProducto) {
		Optional<Producto> producto = productoDAO.findById(Integer.parseInt(codigoProducto));
		return (producto.isPresent())?producto.get():null;
	}

	@Override
	public boolean add(Producto producto) {
		return (productoDAO.save(producto)!=null)?true:false;
	}

	@Override
	public boolean deleteOne(String codigoProducto) {
		try {
			productoDAO.deleteById(Integer.parseInt(codigoProducto));
			return true;
		}
		catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean updateOne(Producto producto) {
		return (productoDAO.save(producto)!=null)?true:false;
	}

}
