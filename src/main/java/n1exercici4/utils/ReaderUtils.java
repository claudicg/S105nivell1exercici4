package n1exercici4.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderUtils {

	public static void llegirArxius(String path, String fileName) {
		
		BufferedReader br = null;
			
		try {
			File file = new File(path + fileName);

		    br = new BufferedReader(new FileReader(file)); 

		    String linea;

		    while ((linea = br.readLine()) != null) {
		        
		    	System.out.println(linea);
		    }
		        
		}catch(FileNotFoundException e) {
		    System.out.println("Fichero no encontrado.");	
		}catch(IOException e) {
		    System.out.println("Error de E/S.");
		}catch(Exception e) {
		    System.out.println("Error general." + e);
		}finally {
		    try {
		    	br.close();
			} catch (IOException e) {
				System.out.println("Error al intentar cerrar el buffer.");
			}
		}
	}
}
