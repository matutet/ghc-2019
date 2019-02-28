package es.keensoft.ghc2019.utils;

import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slide;

import java.util.Iterator;
import java.util.Set;

public class Score {

    public int calculateMinTags(Slide slide) {
        int result = 0;
        Set<Photo> photos = slide.getPhotos();
        for (Iterator<Photo> it = photos.iterator(); it.hasNext(); ) {
            Photo foto = it.next();
            result = foto.getTags().size() > result ? foto.getTags().size(): result;
        }
        return result;
    }


}