package es.keensoft.ghc2019.model;

import java.util.HashSet;
import java.util.Set;

public class Slide {

    private Photo photo1;
    private Photo photo2;
    private Set<String> tags = new HashSet<String>();

    public Slide() {
    }

    public void addPhoto(Photo photo) {
        if (photo1 != null && photo2 != null) {
            throw new RuntimeException("Slide with two photos yet");
        }

        if ((photo1 != null) && (photo1.getOrientation().equals(Orientation.H))) {
            throw new RuntimeException("Slide with an horizontal photo yet");
        }

        if ((photo1 != null)
                && (photo1.getOrientation().equals(Orientation.V))
                && (photo.getOrientation().equals(Orientation.H))
        ) {
            throw new RuntimeException("Cannot mix Vertical and Horizontal Photos");
        }

        if (photo1 == null) {
            photo1 = photo;
        } else {
            photo2 = photo;
        }
        tags.addAll(photo.getTags());
    }

    public void clear() {
        photo1 = null;
        photo2 = null;
        tags.clear();
    }

    public Set<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        String line = Integer.toString(photo1.getId());
        if (photo2 != null) {
            line = line + " " + photo2.getId();
        }
        return line;
    }
}
