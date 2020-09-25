package com.mambu.aha.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

/**
 * Aha! Idea
 */
public class Idea {

	private String id;

	private String name;

	@XmlElement(name = "created_at")
	private Date createdAt;

	@XmlElement(name = "reference_num")
	private String referenceNum;

	private Integer score;

	@XmlElement(name = "product_id")
	private String productId;

	private Integer votes;

	@XmlElement(name = "workflow_status")
	private WorkflowStatus workflowStatus;
	
	@XmlElement(name = "visibility")
	private String visibility;

	private Feature feature;

	private Description description;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the referenceNum
	 */
	public String getReferenceNum() {
		return referenceNum;
	}

	/**
	 * @param referenceNum
	 *            the referenceNum to set
	 */
	public void setReferenceNum(String referenceNum) {
		this.referenceNum = referenceNum;
	}

	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the votes
	 */
	public Integer getVotes() {
		return votes;
	}

	/**
	 * @param votes
	 *            the votes to set
	 */
	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	/**
	 * @return the workflowStatus
	 */
	public WorkflowStatus getWorkflowStatus() {
		return workflowStatus;
	}

	/**
	 * @param workflowStatus
	 *            the workflowStatus to set
	 */
	public void setWorkflowStatus(WorkflowStatus workflowStatus) {
		this.workflowStatus = workflowStatus;
	}

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

	/**
	 * @return the description
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(Description description) {
		this.description = description;
	}
	
	/**
	 * @return the visibility
	 */
	public String getVisibility() {
		return visibility;
	}
	
	/**
	 * @param visibility
	 * 				the visibility to set
	 */
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
}
