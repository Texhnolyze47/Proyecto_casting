package com.mx.test;

import java.util.List;

import com.mx.datos.ClienteDao;
import com.mx.domain.Cliente;

public class TestCliente {
	public static void main(String[] args) {
		ClienteDao clienteDato = new ClienteDao();
		List<Cliente> clientes = clienteDato.selecccionar();
		for(Cliente cliente: clientes) {
			System.out.println("Persona = " + cliente);
		}
	}
}
