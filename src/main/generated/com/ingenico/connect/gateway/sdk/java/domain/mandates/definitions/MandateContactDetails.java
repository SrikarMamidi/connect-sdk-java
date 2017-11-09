/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

/**
 * Contact details of the consumer
 */
public class MandateContactDetails {

	private String emailAddress = null;

	private String phoneNumber = null;

	/**
	 * Email address of the consumer
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Email address of the consumer
	 */
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Phone number of the consumer
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Phone number of the consumer
	 */
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
}
