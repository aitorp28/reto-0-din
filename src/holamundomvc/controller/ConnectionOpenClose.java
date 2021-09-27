/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundomvc.controller;

/**
 *
 * @author aitor
 */

import exception.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;


/**
 * Esta clase contiene los metodos para la conexion a la base de datos.
 * 
 * @author aitor
 */
public class ConnectionOpenClose {
	
	private ResourceBundle configFile;
	private String url, user,  pass;
	
        /**
         * 
         * Este metodo recoge los parametros de un archivo de configuracion 
         * para conectarmos a la base de datos.
         * @autor aitor
         */
	public ConnectionOpenClose() {
		configFile = ResourceBundle.getBundle("holamundomvc.properties.config");
		url = configFile.getString("URL");
		user = configFile.getString("USER");
		pass = configFile.getString("PASSWORD");
	}
        /**
         * Este metodo se encarga de abrir la conexion a la base de datos.
         * @return devuelve la conexion de la base de datos.
         * @throws ConnectException 
         */
	public Connection openConnection() throws ConnectException {

		Connection con= null;
		
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			throw new ConnectException("Error al intentar Conectar con la BD");
		}
		return con;
	}
        /**
         *  Este metodo se encarga de cerrar la conexion a la base de datos.
         * @param stmt
         * @param con
         * @throws ConnectException 
         */
	public void closeConnection(PreparedStatement stmt, Connection con) throws ConnectException {

		if (stmt != null || con != null) {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				throw new ConnectException("Error al intentar Desconectar con la BD");
			}
		}
	}

}