package es.keensoft.ghc2019.model;

import java.util.HashSet;
import java.util.Set;

public class Photo {
	private long id;
	private Orientation orientation;
	private Set<String> tags = new HashSet<String>();

	public Photo(long id, String[] lineContent) {
		this.id = id;
		this.orientation = Orientation.valueOf(lineContent[0]);
		int tagsNumber = Integer.parseInt(lineContent[1]);
		for (int i = 2; i < lineContent.length; i++) {
			tags.add(lineContent[i]);
		}

		if (tags.size() != tagsNumber)
			throw new RuntimeException("No matching tags in photo " + id);
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", orientation=" + orientation + ", tags=" + tags + "]";
	}

}
