package es.keensoft.ghc2019.algorithims;

import java.util.ArrayList;
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
		
		hPhotos.addAll(vPhotos);
		return super.doit(hPhotos);
	}
}
