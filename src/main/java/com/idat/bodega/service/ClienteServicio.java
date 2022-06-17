package com.idat.bodega.service;

import java.util.List;

import com.idat.bodega.dto.ClienteDTORequest;
import com.idat.bodega.dto.ClienteDTOResponse;


public interface ClienteServicio {

	public void guardarCliente (ClienteDTORequest cliente);
	public void editarCliente (ClienteDTORequest cliente);
	
	public void eliminarCliente(Integer id);
	
	public List<ClienteDTOResponse> listarClientes();
	public ClienteDTOResponse obtenerClienteId(Integer id);
}
