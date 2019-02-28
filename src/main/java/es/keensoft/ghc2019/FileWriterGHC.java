package es.keensoft.ghc2019;

import es.keensoft.ghc2019.model.Slide;
import es.keensoft.ghc2019.model.Slideshow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class FileWriterGHC {

    public static void writeFile(String path, Slideshow slideshow) throws IOException {   	
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        
        int size = slideshow.getSlides().size();
        writer.write(Integer.toString(size));
        writer.newLine();
        
        Set<Slide> slides = slideshow.getSlides();
        for (Iterator<Slide> it = slides.iterator(); it.hasNext(); ) {
            Slide slide = it.next();
            writer.write(lineOf(slide));
            writer.newLine();
        }
        
        writer.close();
    }

    public static String lineOf(Slide slide) {

        String line = Integer.toString(slide.photo1.getId());
        if (slide.photo2 != null) {
            line = line + " " + slide.photo2.getId();
        }
        return line;
    }

}
