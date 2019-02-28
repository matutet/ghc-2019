package es.keensoft.ghc2019.model;

import java.util.Set;

public class Slide {

	private Set<id> ids;
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

	public Set<id> getIds() {
		return ids;
	}

	public void setIds(Set<id> ids) {
		this.ids = ids;
	}
}
