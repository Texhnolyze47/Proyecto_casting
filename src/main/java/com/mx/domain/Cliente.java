package com.mx.domain;

public class Cliente {
	
	String nombre;
	String dirrecion;
	String telefono;
	String personaContacto;
	String actividadRealizar;
	
	
	
	
	public Cliente() {
		
	}
	public Cliente(String nombre, String dirrecion, String telefono, String personaContacto,
			String actividadRealizar) {
		super();
		this.nombre = nombre;
		this.dirrecion = dirrecion;
		this.telefono = telefono;
		this.personaContacto = personaContacto;
		this.actividadRealizar = actividadRealizar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirrecion() {
		return dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getPersonaContacto() {
		return personaContacto;
	}
	public void setPersonaContacto(String personaContacto) {
		this.personaContacto = personaContacto;
	}
	public String getActividadRealizar() {
		return actividadRealizar;
	}
	public void setActividadRealizar(String actividadRealizar) {
		this.actividadRealizar = actividadRealizar;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dirrecion=" + dirrecion + ", telefono=" + telefono
				+ ", personaContacto=" + personaContacto + ", actividadRealizar=" + actividadRealizar + "]";
	}
	
	
	
}
