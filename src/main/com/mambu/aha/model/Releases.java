package com.mambu.aha.model;

import java.io.Serializable;
import java.util.List;

/**
 * Wrapper for {@link Release} lists
 */
public class Releases implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Release> releases;

	/**
	 * @return the releases
	 */
	public List<Release> getReleases() {
		return releases;
	}

	/**
	 * @param releases
	 *            the releases to set
	 */
	public void setReleases(List<Release> releases) {
		this.releases = releases;
	}

}
