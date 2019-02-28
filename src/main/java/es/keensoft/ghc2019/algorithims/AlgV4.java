package es.keensoft.ghc2019.algorithims;

import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slideshow;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlgV4 extends AlgV1 {

    @Override
    public Slideshow doit(List<Photo> photos) {
        Comparator<? super Photo> comparator = new Comparator<Photo>() {
            @Override
            public int compare(Photo o1, Photo o2) {
                final int c1 = o1.getOrientation().compareTo(o2.getOrientation());
                if (c1 != 0) {
                    return c1;
                }
                if (o1.getTags().size() == o2.getTags().size()) {
                    return 0;
                } else {
                    return  o1.getTags().size() > o2.getTags().size() ? -1 : 1;
                }
            }
        };
        Collections.sort(photos, comparator);
        return super.doit(photos);
    }
}

