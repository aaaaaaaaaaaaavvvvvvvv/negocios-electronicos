package com.negelec.app.productos.servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negelec.app.productos.entity.CabeceraCompra;
import com.negelec.app.productos.entity.DetalleCompra;
import com.negelec.app.productos.firebase.service.IEmailService;
import com.negelec.app.productos.mapper.CabeceraCompraMapper;
import com.negelec.app.productos.mapper.DetalleCompraMapper;
import com.negelec.app.productos.model.CabeceraCompraModel;
import com.negelec.app.productos.model.DetalleCompraModel;
import com.negelec.app.productos.repository.ICabeceraCompraDAO;
import com.negelec.app.productos.repository.IDetalleCompraDAO;
import com.negelec.app.productos.servicios.ICompraService;

@Service
public class CompraServiceImpl implements ICompraService {

	@Autowired
	private ICabeceraCompraDAO cabeceraCompraRepo;
	@Autowired
	private IDetalleCompraDAO detalleCompraRepo;
	@Autowired
	private IEmailService emailService;
	
	
	@Override
	public boolean agregarCompra(CabeceraCompraModel compra) {
		CabeceraCompra cabeceraCompra = cabeceraCompraRepo.save(CabeceraCompraMapper.fromModelToEntity(compra));
		if (cabeceraCompra != null) {
			try {
				float montoTotal = 0;
				for (DetalleCompraModel detalleCompraModel : compra.getDetalleCarrito()) {
					DetalleCompra aux = detalleCompraRepo.save(DetalleCompraMapper.fromModelToEntity(detalleCompraModel,
							cabeceraCompra.getCodigocompra()));
					montoTotal += aux.getCantidad() * aux.getProducto().getPrecioproducto();
				}
				//emailService.enviarEmail("Usted acaba de comprar en GutiNatura por el monto de "+montoTotal);
			} catch (Exception e) {
				System.out.println(e);
				return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public List<CabeceraCompra> recuperarCompras(int codigousuario) {
		return cabeceraCompraRepo.findPorCodigousuario(codigousuario);
	}

}
