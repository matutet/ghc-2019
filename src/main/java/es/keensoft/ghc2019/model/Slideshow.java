package es.keensoft.ghc2019.model;

import java.util.HashSet;
import java.util.Set;

public class Slideshow {

	private Set<Slide> slides = new HashSet<>();

	public Set<Slide> getSlides() {
		return slides;
	}

	public void setSlides(Set<Slide> slides) {
		this.slides = slides;
	}

}
