package com.mambu.aha.model;

import java.time.LocalDate;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

/**
 * Aha! Feature
 */
public class Feature {

	private String id;

	private String name;

	@XmlElement(name = "reference_num")
	private String referenceNum;

	@XmlElement(name = "created_at")
	private Date createdAt;

	@XmlElement(name = "start_date")
	private LocalDate startDate;

	@XmlElement(name = "due_date")
	private LocalDate dueDate;

	@XmlElement(name = "product_id")
	private String productId;

	private Description description;

	@XmlElement(name = "workflow_status")
	private WorkflowStatus workflowStatus;

	@XmlElement(name = "ideas")
	private Idea[] ideas;

	@XmlElement(name = "custom_fields")
	private CustomField[] customFields;

	private Release release;

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
	 * @return the start date
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the start date to set
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the due date
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate
	 *            the due date to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the product id
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the product id to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
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
	 * @return the ideas
	 */
	public Idea[] getIdeas() {
		return ideas;
	}

	/**
	 * @param ideas
	 *            the ideas to set
	 */
	public void setIdeas(Idea[] ideas) {
		this.ideas = ideas;
	}

	/**
	 * @return the custom fields
	 */
	public CustomField[] getCustomFields() {
		return customFields;
	}

	/**
	 * @param customFields
	 *            the custom fields to set
	 */
	public void setCustomFields(CustomField[] customFields) {
		this.customFields = customFields;
	}

	/**
	 * @return the release
	 */
	public Release getRelease() {
		return release;
	}

	/**
	 * @param release
	 *            the release to set
	 */
	public void setRelease(Release release) {
		this.release = release;
	}

}
