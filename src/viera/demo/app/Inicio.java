package viera.demo.app;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.chainsaw.Main;

public class Inicio {
	
	static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {

    Principal proceso = new Principal();
    PropertyConfigurator.configure("log4j.properties");
		logger.info("Iniciando proceso Principal");
		try {
			proceso.EjecutaProceso();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
		logger.error("Error" + e.getMessage());
		}
		
	

	}

}
