package com.mambu.aha.model;

import java.io.Serializable;
import java.util.List;

/**
 * Wrapper for {@link Feature} lists
 */
public class Features implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Feature> features;

	/**
	 * @return the features
	 */
	public List<Feature> getFeatures() {
		return features;
	}

	/**
	 * @param features
	 *            the features to set
	 */
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

}
