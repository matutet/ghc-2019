package es.keensoft.ghc2019.algorithims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import es.keensoft.ghc2019.model.Photo;
import es.keensoft.ghc2019.model.Slideshow;

public class AlgV2 extends AlgV1 {
	@Override
	public Slideshow doit(List<Photo> photos) {
		List<Photo> vPhotos = new ArrayList<>();
		List<Photo> hPhotos = new ArrayList<>();
		
		for (Photo photo : photos) {
			switch (photo.getOrientation()) {
			case H:
				hPhotos.add(photo);
				break;
			case V:
				vPhotos.add(photo);
				break;
			default:
				break;
			}
		}
		
		Collections.sort(vPhotos, tagsComparator);
		Collections.sort(hPhotos, tagsComparator);
		
		hPhotos.addAll(vPhotos);
		return super.doit(hPhotos);
	}
	
	private static final Comparator<Photo> tagsComparator = new Comparator<Photo>() {
        @Override
        public int compare(Photo o1, Photo o2) {
            if(o1.getTags().size() > o2.getTags().size())
            	return -1;
            if(o1.getTags().size() < o2.getTags().size())
            	return 1;
            return 0;
        }
    };
}
