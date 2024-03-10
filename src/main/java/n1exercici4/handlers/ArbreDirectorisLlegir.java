package n1exercici4.handlers;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import n1exercici4.utils.WriterUtils;


public class ArbreDirectorisLlegir {
	
public String ordernarDirectori(String path) {
		
		StringBuilder sb = new StringBuilder();
		File directori = new File(path);
		SimpleDateFormat formatData = new SimpleDateFormat("yyyyMMdd");
	
		if(!directori.isDirectory()) {
			sb.append("La ruta donada no és un directori vàlid\n");
		}
		File[] arxius = directori.listFiles();
		Arrays.sort(arxius);
		
		for(File arxiu : arxius) {
			
			Date dataModificacio = new Date(arxiu.lastModified());
			if(arxiu.isDirectory()) {
				sb.append("Directori: " + arxiu.getName() + " - Última modificació : "
						+ formatData.format(dataModificacio) + "\n");
				sb.append(ordernarDirectori(path + "/" + arxiu.getName()));
			}else {
				sb.append("Arxiu: " + arxiu.getName() + " - Última modificació : "
						+ formatData.format(dataModificacio) + "\n");
			}
		}
		String arxiuArbreDirectori = sb.toString();
		
		return arxiuArbreDirectori;
	}
	
	public void escriureDirectoriTxt() {

		WriterUtils.escriureArxius("arxiuArbreDirector", "src/main/resources/Readme",
								"/readme_escriureArxiu");
	}
	
	
}
