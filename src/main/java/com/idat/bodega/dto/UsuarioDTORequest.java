package com.idat.bodega.dto;

public class UsuarioDTORequest {

	private String usuario;
	private String password;
	
	public UsuarioDTORequest(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}
	
	
	public UsuarioDTORequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
