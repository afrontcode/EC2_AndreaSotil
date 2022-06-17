package com.idat.bodega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.bodega.dto.BodegaDTORequest;
import com.idat.bodega.dto.BodegaDTOResponse;
import com.idat.bodega.model.Bodega;
import com.idat.bodega.repositorio.BodegaRepositorio;

@Service
public class BodegaServicioImpl implements BodegaServicio {
	
	@Autowired
	public BodegaRepositorio repositorio;

	@Override
	public void guardarBodega(BodegaDTORequest bodega) {
		Bodega b = new Bodega();
		b.setIdBodega(bodega.getIdBodegaDTO());
		b.setNombre(bodega.getNombreDTO());
		b.setDireccion(bodega.getDireccionDTO());
		repositorio.save(b);
		
	}

	@Override
	public void editarBodega(BodegaDTORequest bodega) {
		Bodega b = new Bodega();
		b.setIdBodega(bodega.getIdBodegaDTO());
		b.setNombre(bodega.getNombreDTO());
		b.setDireccion(bodega.getDireccionDTO());
		repositorio.saveAndFlush(b);
		
	}

	@Override
	public void eliminarBodega(Integer id) {
		repositorio.deleteById(id);
		}

	@Override
	public List<BodegaDTOResponse> listarBodegas() {
		List<BodegaDTOResponse> lista = new ArrayList<BodegaDTOResponse>();
		BodegaDTOResponse b = null; 
		
		for(Bodega bodega :repositorio.findAll()) {
			b = new BodegaDTOResponse();
			
			b.setIdBodegaDTO(bodega.getIdBodega());
			b.setNombreDTO(bodega.getNombre());
			b.setDireccionDTO(bodega.getDireccion());
			
			lista.add(b);
		}
		return lista;
	}

	@Override
	public BodegaDTOResponse obtenerBodegaId(Integer id) {
		Bodega bodega = repositorio.findById(id).orElse(null);
		BodegaDTOResponse b = new BodegaDTOResponse();
		b.setIdBodegaDTO(bodega.getIdBodega());
		b.setNombreDTO(bodega.getNombre());
		b.setDireccionDTO(bodega.getDireccion());
		return b;
	}

}
