/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

public class MandateResponse {

	private MandateCustomer customer = null;

	private String customerReference = null;

	private String recurrenceType = null;

	private String status = null;

	private String uniqueMandateReference = null;

	/**
	 * Customer object containing customer specific inputs
	 */
	public MandateCustomer getCustomer() {
		return customer;
	}

	/**
	 * Customer object containing customer specific inputs
	 */
	public void setCustomer(MandateCustomer value) {
		this.customer = value;
	}

	/**
	 * The unique identifier of the customer to which this mandate is applicable
	 */
	public String getCustomerReference() {
		return customerReference;
	}

	/**
	 * The unique identifier of the customer to which this mandate is applicable
	 */
	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	/**
	 * Specifieds whether the mandate is for one-off or recurring payments.
	 */
	public String getRecurrenceType() {
		return recurrenceType;
	}

	/**
	 * Specifieds whether the mandate is for one-off or recurring payments.
	 */
	public void setRecurrenceType(String value) {
		this.recurrenceType = value;
	}

	/**
	 * The status of the mandate. Possible values are:
	 * <ul>
	 * <li>ACTIVE
	 * <li>EXPIRED
	 * <li>CREATED
	 * <li>REVOKED
	 * <li>WAITING_FOR_REFERENCE
	 * <li>BLOCKED
	 * <li>USED
	 * </ul><br>
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * The status of the mandate. Possible values are:
	 * <ul>
	 * <li>ACTIVE
	 * <li>EXPIRED
	 * <li>CREATED
	 * <li>REVOKED
	 * <li>WAITING_FOR_REFERENCE
	 * <li>BLOCKED
	 * <li>USED
	 * </ul><br>
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * The unique identifier of the mandate
	 */
	public String getUniqueMandateReference() {
		return uniqueMandateReference;
	}

	/**
	 * The unique identifier of the mandate
	 */
	public void setUniqueMandateReference(String value) {
		this.uniqueMandateReference = value;
	}
}
