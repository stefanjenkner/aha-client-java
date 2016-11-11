package com.mambu.aha.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Aha! Idea
 */
public class Idea {

	private String id;

	private String name;

	@XmlElement(name = "reference_num")
	private String referenceNum;

	@XmlElement(name = "product_id")
	private String productId;

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
