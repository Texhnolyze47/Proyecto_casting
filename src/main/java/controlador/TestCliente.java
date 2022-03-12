package controlador;

import java.util.List;

import modelo.ClienteDao;
import modelo.Cliente;

public class TestCliente {
	public static void main(String[] args) {
		
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes = clienteDao.selecccionar();
		
		Cliente clienteNuevo =  new Cliente("Crysta Miche", "1 Heffernan Alley"  , "698-545-0539", "Chev Bartlet", "Analyst Programmer");
		clienteDao.insertar(clienteNuevo);
		
		
		for(Cliente cliente: clientes) {
			System.out.println("Persona = " + cliente);
		}
	}
}
