package viera.demo.app;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import viera.demo.negocio.Factory;
import viera.demo.util.Conexion;
import viera.demo.util.ExtraerConfiguracion;
import viera.demo.util.GetUrl;
import viera.demo.vo.EmpleadosVO;
import viera.demo.vo.PropiedadesVO;

public class Principal {
	public String base, usr, pass;
	static Logger logger = Logger.getLogger(Main.class);
	
	public void EjecutaProceso() throws ClassNotFoundException, SQLException {
		
	

	//	String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		
        
		String dataUrl = GetUrl.getTextFromUrl("http://www.viera.cl/");
		logger.info(dataUrl);
		ExtraerConfiguracion dao = new ExtraerConfiguracion();
		PropiedadesVO propiedades = new PropiedadesVO();
		propiedades = dao.cargarProperties();
		
		base = propiedades.getBase();
		usr = propiedades.getUser();
		pass = propiedades.getPass();
		
		System.out.println(base);
		System.out.println(usr);
		System.out.println(pass);
		
		Conexion db = new Conexion();
		Connection conectBD = db.conectar(base, usr, pass);
		
		Factory elFactory = new Factory();
		
		ArrayList<EmpleadosVO> losempleados = elFactory.getEmpleados(conectBD);
		
		 if (losempleados.size()>0){
			 
			 for (int ive = 0; ive < losempleados.size(); ive++)	{
			System.out.println(losempleados.get(ive).getNombres());	    
			 }
		 }
		
		db.Desconectar();
		System.out.println("Fin");

	}
	

}
