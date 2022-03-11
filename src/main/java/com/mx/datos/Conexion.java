package com.mx.datos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Conexion {
	private static final String  JDBC_URL =  "jdbc:mysql://localhost:3306/usuarios_casting?useSSL=false&useTimezone=UTC&allowPublicKeyRetrieval=true";
	private static final String  JDBC_USER =  "root";
	private static final String  JDBC_PASSWORD =  "admin";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
	}
	
	public static void close(Resultset rs) {
		
	}
}
