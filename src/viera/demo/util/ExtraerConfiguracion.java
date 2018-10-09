package viera.demo.util;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

import viera.demo.vo.PropiedadesVO;

public class ExtraerConfiguracion { 
	
   

	static Logger logger = Logger.getLogger("viera.demo");

	public PropiedadesVO cargarProperties() {
		Properties properties = new Properties();
		PropiedadesVO propiedadesVO = new PropiedadesVO();
		FileInputStream file;
		String path = "./configuracion.properties";

		try {

			file = new FileInputStream(path);
			properties.load(file);
			file.close();

			propiedadesVO.setUser(properties.getProperty("user"));
			propiedadesVO.setPass(properties.getProperty("pass"));
			propiedadesVO.setTiempo(properties.getProperty("tiempo"));
			propiedadesVO.setBase(properties.getProperty("base"));
		    logger.info("Archivo de parametros");
		    logger.info("configuracion.properties");

		} catch (Throwable e) {

			logger.error("Error al cargar Archivo de propiedades:" + e.getMessage());

		}

		return propiedadesVO;

	}

	
	

}
