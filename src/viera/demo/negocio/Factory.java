package viera.demo.negocio;

import java.sql.Connection;
import java.util.ArrayList;

import viera.demo.dao.GetInformacion;
import viera.demo.vo.*;

public class Factory {
	
	
	public ArrayList<EmpleadosVO> getEmpleados(Connection conectBD){
		GetInformacion ladata = new GetInformacion();
		ArrayList<EmpleadosVO> listaRequestVO = ladata.extraeEmpleados(conectBD);
		return listaRequestVO;
	}

}
