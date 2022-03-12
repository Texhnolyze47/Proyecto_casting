package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ivan
 */
public class Contrato {
    String Descripcion;
    
     public Contrato() {
        
    }
     public Contrato(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "Contrato{" + "Descripcion=" + Descripcion + '}';
    }

   
    
            
}
