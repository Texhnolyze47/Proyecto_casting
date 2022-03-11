package com.mx.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestMSql {

	public static void main(String[] args) {
		
		 String  url =  "jdbc:mysql://localhost:3306/usuarios_casting?useSSL=false&useTimezone=UTC&allowPublicKeyRetrieval=true";
		
		try {
			Connection conexion = DriverManager.getConnection(url,"root","admin");
			java.sql.Statement instruccion = conexion.createStatement(); 
			String sql = "SELECT id,create_time,nombre,direccion,tel_contacto,fecha_nacimiento,tipo_contratacion FROM candidatos";
			ResultSet  resultado = instruccion.executeQuery(sql);
			while (resultado.next()) {
				System.out.println("id Persona:" + resultado.getInt("id"));
				System.out.println("Nombre:" + resultado.getString("nombre"));
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
		// TODO Auto-generated method stub

	}

}
