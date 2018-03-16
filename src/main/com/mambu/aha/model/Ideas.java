package com.mambu.aha.model;

import java.io.Serializable;
import java.util.List;

/**
 * Wrapper for {@link Idea} lists
 *
 */
public class Ideas implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Idea> ideas;

	/**
	 * @return the ideas
	 */
	public List<Idea> getIdeas() {
		return ideas;
	}

	/**
	 * @param ideas
	 *            the ideas to set
	 */
	public void setIdeas(List<Idea> ideas) {
		this.ideas = ideas;
	}

}
