package com.idat.bodega.service;

import java.util.List;

import com.idat.bodega.dto.BodegaDTORequest;
import com.idat.bodega.dto.BodegaDTOResponse;

public interface BodegaServicio {

	public void guardarBodega (BodegaDTORequest bodega);
	public void editarBodega (BodegaDTORequest bodega);
	
	public void eliminarBodega(Integer id);
	
	public List<BodegaDTOResponse> listarBodegas();
	public BodegaDTOResponse obtenerBodegaId(Integer id);
}
