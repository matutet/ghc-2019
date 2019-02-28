package es.keensoft.ghc2019.model;

import java.util.HashSet;
import java.util.Set;

public class Photo {
	private int id;
	private Orientation orientation;
	private Set<String> tags = new HashSet<String>();

	public Photo(String[] lineContent) {
		// TODO Auto-generated constructor stub
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Photo [orientation=" + orientation + ", tags=" + tags + "]";
	}

}
