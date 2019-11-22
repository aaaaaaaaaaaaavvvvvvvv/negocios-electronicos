package com.negelec.app.productos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negelec.app.productos.entity.CabeceraCompra;
import com.negelec.app.productos.mapper.CabeceraCompraMapper;
import com.negelec.app.productos.mapper.DetalleCompraMapper;
import com.negelec.app.productos.model.CabeceraCompraModel;
import com.negelec.app.productos.repository.ICabeceraCompraDAO;
import com.negelec.app.productos.repository.IDetalleCompraDAO;
import com.negelec.app.productos.servicios.Impl.ICompraService;

@Service
public class CompraServiceImpl implements ICompraService {

	@Autowired
	private ICabeceraCompraDAO cabeceraCompraRepo;
	@Autowired
	private IDetalleCompraDAO detalleCompraRepo;

	@Override
	public boolean agregarCompra(CabeceraCompraModel compra) {
		CabeceraCompra cabeceraCompra = cabeceraCompraRepo.save(CabeceraCompraMapper.fromModelToEntity(compra));
		if (cabeceraCompra != null) {
			try {
				compra.getDetalleCarrito().forEach((detalleCompraModel) -> {
					detalleCompraRepo.save(DetalleCompraMapper.fromModelToEntity(detalleCompraModel,
							cabeceraCompra.getCodigocompra()));
				});
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
