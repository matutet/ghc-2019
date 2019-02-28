package es.keensoft.ghc2019.launchers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import es.keensoft.ghc2019.FileWriterGHC;
import es.keensoft.ghc2019.algorithims.AlgV1;
import es.keensoft.ghc2019.algorithims.Algorithm;
import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slideshow;
import es.keensoft.ghc2019.reader.FileReader;

public class FullLauncher {
	private static final String OUT = "out/V1";

	public static void main(String[] args) {
		try {
			File dir = new File(OUT);
			if(dir.exists())
				deleteDir(dir);
			dir.mkdirs();

			doIt("src/main/resources/a_example.txt", OUT + "/a_example.txt");
			doIt("src/main/resources/b_lovely_landscapes.txt", OUT + "/b_lovely_landscapes.txt");
			doIt("src/main/resources/c_memorable_moments.txt", OUT + "/c_memorable_moments.txt");
			doIt("src/main/resources/d_pet_pictures.txt", OUT + "/d_pet_pictures.txt");
			doIt("src/main/resources/e_shiny_selfies.txt", OUT + "/e_shiny_selfies.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void doIt(String in, String out) throws IOException {
		Algorithm alg = new AlgV1();
		List<Photo> photoList = FileReader.readFile(in);
		Slideshow slideshow = alg.doit(photoList);
		FileWriterGHC.writeFile(out, slideshow);
	}
	
	private static void deleteDir(File file) {
	    File[] contents = file.listFiles();
	    if (contents != null) {
	        for (File f : contents) {
	            deleteDir(f);
	        }
	    }
	    file.delete();
	}
}
