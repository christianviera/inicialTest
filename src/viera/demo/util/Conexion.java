package viera.demo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;


public class Conexion {
	public String base, usr, pass, url;
	public Connection conexion;
	//Logger logger = Logger.getLogger("log_file");
	static Logger logger = Logger.getLogger("viera.demo");
	
public Connection conectar(String base, String usr,String pass ) throws ClassNotFoundException{
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			  String connectionUrl = base ;
			  conexion = DriverManager.getConnection(connectionUrl,usr,pass);
			 logger.info("Conexion correcta a BD");		
			//  System.out.println("ok");
			}   
			catch (Throwable ex) 
			{ 
			logger.error("Error al realizar conexion con BD: " + ex.getMessage());
			//	System.out.println("No OK "  + ex.getMessage());
			}
		return conexion;
		}
public Connection Desconectar() throws SQLException {
		conexion.close();
		conexion = null;
		return conexion;
	}

}
