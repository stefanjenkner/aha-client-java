package com.mambu.aha.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.mambu.aha.util.DateAdapter;

/**
 * Aha! Release
 */
public class Release {

	private String id;

	@XmlElement(name = "product_id")
	private String productId;

	@XmlElement(name = "reference_num")
	private String referenceNum;

	private String name;

	@XmlElement(name = "start_date")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date startDate;

	@XmlElement(name = "release_date")
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date releaseDate;

	private Boolean released;

	@XmlElement(name = "parking_lot")
	private Boolean parkingLot;

	@XmlElement(name = "workflow_status")
	private WorkflowStatus workflowStatus;

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
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * @param releaseDate
	 *            the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * @return the released
	 */
	public Boolean getReleased() {
		return released;
	}

	/**
	 * @param released
	 *            the released to set
	 */
	public void setReleased(Boolean released) {
		this.released = released;
	}

	/**
	 * @return the parkingLot
	 */
	public Boolean getParkingLot() {
		return parkingLot;
	}

	/**
	 * @param parkingLot
	 *            the parkingLot to set
	 */
	public void setParkingLot(Boolean parkingLot) {
		this.parkingLot = parkingLot;
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

}
