package es.keensoft.ghc2019;

import es.keensoft.ghc2019.reader.FileReader;

public class DaniLauncher {
	public static void main(String[] args) {
		try {
//			String path = "src/main/resources/a_example.txt";
//			String path = "src/main/resources/b_lovely_landscapes.txt";
//			String path = "src/main/resources/c_memorable_moments.txt";
//			String path = "src/main/resources/d_pet_pictures.txt";			
			String path = "src/main/resources/e_shiny_selfies.txt";
			
			FileReader.readFile(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
