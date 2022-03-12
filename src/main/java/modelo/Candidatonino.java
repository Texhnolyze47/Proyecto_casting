/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ivan
 */
public class Candidatonino {
    int id;
    String nombre;
    String dirrecion;
    String telefono;
    String fechaNacimiento;
    String nombreTutor;

    public Candidatonino() {
    }

    public Candidatonino(String nombre, String dirrecion, String telefono, String fechaNacimiento, String nombreTutor) {
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreTutor = nombreTutor;
    }

    public Candidatonino(int id, String nombre, String dirrecion, String telefono, String fechaNacimiento, String nombreTutor) {
        this.id = id;
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;

        this.nombreTutor = nombreTutor;
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


    public String getnombreTutor() {
        return nombreTutor;
    }

    public void setnombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    @Override
    public String toString() {
        return "Candidato{" + "id=" + id + ", nombre=" + nombre + ", dirrecion=" + dirrecion + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", DNI=" + nombreTutor + '}';
    }
    
    
}
