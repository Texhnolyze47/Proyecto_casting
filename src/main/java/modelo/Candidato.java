/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ivan
 */
public class Candidato {
    int id;
    String nombre;
    String dirrecion;
    String telefono;
    String fechaNacimiento;
    String foto;
    String DNI;

    public Candidato() {
    }

    public Candidato(String nombre, String dirrecion, String telefono, String fechaNacimiento, String foto, String DNI) {
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.foto = foto;
        this.DNI = DNI;
    }

    public Candidato(int id, String nombre, String dirrecion, String telefono, String fechaNacimiento, String foto, String DNI) {
        this.id = id;
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.foto = foto;
        this.DNI = DNI;
    }
    
      public Candidato(int id, String nombre, String dirrecion, String telefono, String fechaNacimiento, String DNI) {
        this.id = id;
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
    }
    public Candidato(String nombre, String dirrecion, String telefono, String fechaNacimiento, String DNI) {
    
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Candidato{" + "id=" + id + ", nombre=" + nombre + ", dirrecion=" + dirrecion + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", foto=" + foto + ", DNI=" + DNI + '}';
    }
    
    
}
