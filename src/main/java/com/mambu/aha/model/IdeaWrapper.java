package com.mambu.aha.model;

import java.io.Serializable;

/**
 * Wrapper for {@link Idea} instance
 *
 */
public class IdeaWrapper implements Serializable {

	private static final long serialVersionUID = 1L;

	private Idea idea;

	/**
	 * @return the idea
	 */
	public Idea getIdea() {
		return idea;
	}

	/**
	 * @param idea
	 *            the idea to set
	 */
	public void setIdea(Idea idea) {
		this.idea = idea;
	}

}
