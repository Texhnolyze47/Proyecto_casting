/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.cj.xdevapi.Client;
import java.io.PrintStream;
import java.util.List;
import modelo.Cliente;
import modelo.ClienteDao;
import vistas.*;


public class RegistroController {
    public static ClienteGUI ventana = new ClienteGUI();
    public static void mostrar(){ventana.setVisible(true); }
    public static void ocultar(){ventana.setVisible(false);}
    
    public static void evento (){
       
        try {
        String nombre = ventana.getTxtNombreCliente().getText();
        String direccion = ventana.getTxtDireccionCliente().getText();
        String telefono = ventana.getTxtTelefonoCliente().getText();
        String contactoCliente = ventana.getTxtContactoCliente().getText();
        String actividad = ventana.getTxtActividadCliente().getText();
        ClienteDao clienteDao = new ClienteDao();
        Cliente clienteNuevo =  new Cliente(nombre, direccion, telefono, contactoCliente , actividad);
        clienteDao.insertar(clienteNuevo);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    
         
    }

  
}
