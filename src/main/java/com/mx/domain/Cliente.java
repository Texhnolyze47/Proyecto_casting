package com.mx.domain;

public class Cliente {
	
	int id ;
	String nombre;
	String dirrecion;
	String personaContacto;
	String actividadRealizar;
	
	
	
	
	public Cliente() {
		
	}
	public Cliente(int id,String nombre, String dirrecion, String personaContacto,
			String actividadRealizar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dirrecion = dirrecion;
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
		return dirrecion;
	}
	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
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
		return "Cliente [nombre=" + nombre + ", dirrecion=" + dirrecion + ", personaContacto=" + personaContacto + ", actividadRealizar=" + actividadRealizar + "]";
	}
	
	
	
}
