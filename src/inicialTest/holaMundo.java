package inicialTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class holaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("hola Primers");
     int numero1 =0;
     int numero2 =22;
     int resultado =0;
     
     resultado = numero1 + numero2;
     System.out.println(resultado);
     
     
     
     File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
     
     try {
     archivo = new File ("/Users/christianviera/ejemplo1.txt");
     fr = new FileReader (archivo);
     br = new BufferedReader(fr);

     // Lectura del fichero
     String linea;
     while((linea=br.readLine())!=null)
        System.out.println(linea);
     } catch(Exception e){
         e.printStackTrace();
      }
     
	}

}
