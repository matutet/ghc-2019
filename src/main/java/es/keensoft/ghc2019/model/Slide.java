package es.keensoft.ghc2019.model;

import java.util.Iterator;
import java.util.Set;

public class Slide {

    private Set<Photo> photos;
    private Set<String> tags;


    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }


    @Override
    public String toString() {
        String line = "";
        for (Iterator<Photo> it = photos.iterator(); it.hasNext(); ) {
            Photo photo = it.next();
            line.concat(Integer.toString(photo.getId()));
        }
        return line;
    }
}
