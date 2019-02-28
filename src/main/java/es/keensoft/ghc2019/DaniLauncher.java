package es.keensoft.ghc2019;

import java.util.List;

import es.keensoft.ghc2019.algorithims.AlgV1;
import es.keensoft.ghc2019.algorithims.Algorithm;
import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slideshow;
import es.keensoft.ghc2019.reader.FileReader;

public class DaniLauncher {
	public static void main(String[] args) {
		try {
			String path = "src/main/resources/a_example.txt";
			String out = "out/a_example.txt";

			List<Photo> photoList = FileReader.readFile(path);
			Algorithm alg = new AlgV1();
			Slideshow slideshow = alg.doit(photoList);
			FileWriterGHC.writeFile(out, slideshow);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
