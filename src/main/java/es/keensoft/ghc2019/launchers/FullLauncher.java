package es.keensoft.ghc2019.launchers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import es.keensoft.ghc2019.FileWriterGHC;
import es.keensoft.ghc2019.algorithims.AlgV2;
import es.keensoft.ghc2019.algorithims.Algorithm;
import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slideshow;
import es.keensoft.ghc2019.reader.FileReader;

public class FullLauncher {
	private static final String OUT = "/tmp/V1";
	private static final String INPUT = "/Users/matutet/wrkspc/hashcode2019/src/main/resources/";

	public static void main(String[] args) {
		try {
			File dir = new File(OUT);
			if(dir.exists())
				deleteDir(dir);
			dir.mkdirs();

			int superScore = 0;

			superScore += doIt(INPUT + "/a_example.txt", OUT + "/a_example.txt");
			superScore += doIt(INPUT + "/b_lovely_landscapes.txt", OUT + "/b_lovely_landscapes.txt");
			superScore += doIt(INPUT + "/c_memorable_moments.txt", OUT + "/c_memorable_moments.txt");
			superScore += doIt(INPUT + "/d_pet_pictures.txt", OUT + "/d_pet_pictures.txt");
			superScore += doIt(INPUT + "/e_shiny_selfies.txt", OUT + "/e_shiny_selfies.txt");

			System.out.println("Algorithim score: " + superScore);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int doIt(String in, String out) throws IOException {
		Algorithm alg = new AlgV2();
		List<Photo> photoList = FileReader.readFile(in);
		Slideshow slideshow = alg.doit(photoList);
		FileWriterGHC.writeFile(out, slideshow);
		return alg.getTotalScore();
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
