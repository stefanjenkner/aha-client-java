package com.mambu.aha.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * Aha! Feature
 */
public class Feature {

	private String id;

	private String name;

	@XmlElement(name = "reference_num")
	private String referenceNum;

	private Description description;

	@XmlElement(name = "workflow_status")
	private WorkflowStatus workflowStatus;

	@XmlElement(name = "ideas")
	private Idea[] ideas;

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
