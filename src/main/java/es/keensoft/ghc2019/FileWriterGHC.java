package es.keensoft.ghc2019;

import es.keensoft.ghc2019.model.Slide;
import es.keensoft.ghc2019.model.Slideshow;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/**
 * Project: hashcode2019
 * Author: victorrillo
 * Date: 2019-02-28 19:32
 * Comment:
 **/
public class FileWriterGHC {

    private BufferedWriter writer;

    private void writeFile(String path, Slideshow slideshow) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        Set<Slide> slides = slideshow.getSlides();
        int size = slideshow.getSlides().size();
        writer.write(size);
        for (Iterator<Slide> it = slides.iterator(); it.hasNext(); ) {
            Slide slide = it.next();
            writer.write(slide.toString());
        }

    }

}
