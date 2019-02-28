package es.keensoft.ghc2019.model;

import java.util.Set;

public class Photo {
	private Orientation orientation;
	private Set<String> tags;

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Photo [orientation=" + orientation + ", tags=" + tags + "]";
	}

}
