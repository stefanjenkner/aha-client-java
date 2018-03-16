package com.mambu.aha.model;

/**
 * Sub-resource used e.g. in features and ideas
 */
public class Description {

	private String id;

	private String body;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the body (HTML)
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set (HTML)
	 */
	public void setBody(String body) {
		this.body = body;
	}

}
