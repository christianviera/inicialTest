package viera.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import viera.demo.vo.*;

public class GetInformacion {

	
	public ArrayList<EmpleadosVO> extraeEmpleados(Connection conectBD){

		ArrayList<EmpleadosVO> listaRequestVO = new ArrayList<EmpleadosVO>();
		String sql = "";
	 sql = "select rut,nombres, apellido,edad from empleados;";  

		try {
			Statement stmt = conectBD.createStatement();
		    ResultSet rows = stmt.executeQuery(sql);
		    while (rows.next()){
		    	EmpleadosVO requestVO = new EmpleadosVO();
		    	requestVO.setRut(rows.getString("rut"));
		    	requestVO.setApellido(rows.getString("apellido"));
		    	requestVO.setNombres(rows.getString("nombres"));
		    	requestVO.setEdad(rows.getString("edad"));

		    	listaRequestVO.add(requestVO);
		    }
		} catch (SQLException e) {
			//logger.error("SQLException extraeContratosVE: " + e.getMessage());
			System.out.println(e.getMessage());
		} catch (Exception e){
			//logger.error("Exception extraeContratosVE: " + e);
			System.out.println(e);
		}
		
		return listaRequestVO;
	}	
	
}
