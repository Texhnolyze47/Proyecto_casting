package com.mx.domain;

public class Cliente {
	
	int id ;
	String nombre;
	String direccion;
	String telefono;
	String personaContacto;
	String actividadRealizar;
	
	public Cliente() {
		
	}
	public Cliente(int id,String nombre, String dirrecion, String personaContacto,
			String actividadRealizar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = dirrecion;
		this.personaContacto = personaContacto;
		this.actividadRealizar = actividadRealizar;
	}
	
	
	
	public Cliente(int id, String nombre, String direccion, String telefono, String personaContacto,
			String actividadRealizar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.personaContacto = personaContacto;
		this.actividadRealizar = actividadRealizar;
	}
	
	
	public Cliente(String nombre, String direccion, String telefono, String personaContacto, String actividadRealizar) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.personaContacto = personaContacto;
		this.actividadRealizar = actividadRealizar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirrecion() {
		return direccion;
	}
	public void setDirrecion(String dirrecion) {
		this.direccion = dirrecion;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		return "Cliente [nombre=" + nombre + ", dirrecion=" + direccion + ", personaContacto=" + personaContacto + ", actividadRealizar=" + actividadRealizar + "]";
	}
	
	
	
}
