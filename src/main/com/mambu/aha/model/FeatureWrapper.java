package com.mambu.aha.model;

import java.io.Serializable;

/**
 * Wrapper for {@link Feature} instance
 */
public class FeatureWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	private Feature feature;

	/**
	 * @return the feature
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * @param feature
	 *            the feature to set
	 */
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}
