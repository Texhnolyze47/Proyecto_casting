package com.mx.test;

import java.lang.invoke.VarHandle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class TestMSql {

	public static void main(String[] args) {
		
		String url =  "jdbc:mysql://localhost:3306/usuarios_casting?useSSL=false&useTimezone=UTC&allowPublicKeyRetrieval=true";
		try {
			Connection conexion = DriverManager.getConnection(url,"root","admin");
			java.sql.Statement instruccion = conexion.createStatement(); 
			String sql = "SELECT * FROM candidatos LIMIT 100";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
		// TODO Auto-generated method stub

	}

}
