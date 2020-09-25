package com.mambu.aha.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

/**
 * Sub-resource used e.g. in features and ideas
 */
public class Description {

	private String id;

	private String body;

	@XmlElement(name = "created_at")
	private Date createdAt;

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

	/**
	 * @return the creation date
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt
	 *            the creation date to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
