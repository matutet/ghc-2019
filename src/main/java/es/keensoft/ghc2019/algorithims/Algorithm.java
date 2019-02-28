package es.keensoft.ghc2019.algorithims;

import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slideshow;

import java.util.List;

public interface Algorithm {
    Slideshow doit(List<Photo> photos);
}
