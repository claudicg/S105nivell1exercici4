package n1exercici4.main;

import n1exercici4.utils.ReaderUtils;

public class ArbreDirectorisLlegirMain {

	public static void main(String[] args) {
		
		ReaderUtils.llegirArxius("src/main/resources/ArxiusTxt", "/llistaDni.txt");
		ReaderUtils.llegirArxius("src/main/resources/Readme", "/readme_escriureArxiu.txt");
	}

}
