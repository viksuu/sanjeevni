package com.medical.ayurveda.sanjeevni.exceptions;

import static org.springframework.http.HttpStatus.ALREADY_REPORTED;
import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NON_AUTHORITATIVE_INFORMATION;

import org.springframework.http.HttpStatus;

public enum SanjeevniErrorCodes {

	
	// Application Errors
		A001(INTERNAL_SERVER_ERROR, "Generic application error."),
		A002(BAD_REQUEST, "Please provide valid parameters"),
		A003(BAD_REQUEST, "Entity Not Found"),
		
		A004(BAD_REQUEST, "Muncipalities not found in Omni "),
		
		CV001(BAD_REQUEST, "%s Can't be Null"),
		
		CV002(BAD_REQUEST, "No Records Found for Key %s"),
		
		CV003(BAD_REQUEST, "No Records Found for Key %s"),
		
		UV001(BAD_REQUEST, "Customer not found in Omni"),
		
		UV002(BAD_REQUEST, "Unable to update Customer to Omni"),
		
		UV003(NON_AUTHORITATIVE_INFORMATION, "Unable to update Password to OMNI"),
		
		UV004(BAD_REQUEST, "No UrlMapping found for the company Id %s"),
		
		IV001(BAD_REQUEST, "Invitations not found in Sanjeevni for the companyId %s"),
		
		UV005(BAD_REQUEST, "User not found with HexCode %s"),
		
		UV006(ALREADY_REPORTED, "User Registration Already Confirmed"),
		
		UV007(BAD_REQUEST, "User not found in Sanjeevni with User ID %d"),
		
		PV001(BAD_REQUEST, "Proviences not found in Omni"),
		
		PV003(BAD_REQUEST, "EmailId is requied to update Password"),
		
		GV001(BAD_REQUEST, "%s not found in the DB"),
		
		PV002(BAD_REQUEST, "Provice not found in Omni to get the muncipalities"),
		
		PV004(BAD_REQUEST, "User does not exists with email Id to update"),
		
		PV005(BAD_REQUEST, "Product Details Can't be null"),
		
		SV001(BAD_REQUEST, "No SKUS returned from Omni"),
		
		MV002(BAD_REQUEST, "Muncipalities not found in Omni "),
		
		ES001(BAD_REQUEST, "Elastic Search Error"),
		
		C0001(BAD_REQUEST, "Company not found"),
		CE005(BAD_REQUEST, "Company Category not found"),
		CD001(BAD_REQUEST, "Department Codes are not configured for company"),
		
		
		// Event related error messages
		EV001(BAD_REQUEST, "Event not found"),
		EV002(BAD_REQUEST, "Cannot update wishlist quantity to zero for sku %s"),
		EV003(BAD_REQUEST, "Event is already confirmed"),
		EV004(BAD_REQUEST, "Event is already expired"),
		EV005(BAD_REQUEST, "Event barcode is not found in Sanjeevni"),
		EV006(BAD_REQUEST, "Event confirmation is not yet done"),
		EV007(BAD_REQUEST, "The current operation not supported for the Company"),
		EV008(ALREADY_REPORTED, "Event Already Confirmed"),
		EV009(BAD_REQUEST, "Event with Id %s doesnot have wishlist to display"),
		EV010(BAD_REQUEST, "Event wish list is not associated to the requested eventId");
		
	
	/***** OBJECT MEMBERS *******/

	private int statusCode;
	private String status;
	private String identifier;
	private String description;
	private HttpStatus httpStatus;
	
	/**
	 * 
	 * @param httpStatus
	 * @param description
	 */
	
	private SanjeevniErrorCodes(int statucCode, String description) {
		this.statusCode = statucCode;
		this.description = description;
	}

	/**
	 * 
	 * @param httpStatus
	 * @param description
	 */
	private SanjeevniErrorCodes(HttpStatus httpStatus, String identifier, String description) {
		this.httpStatus = httpStatus;
		this.statusCode = httpStatus.value();
		this.status = httpStatus.getReasonPhrase();
		this.identifier = identifier;
		this.description = description;
	}

	/**
	 * 
	 * @param httpStatus
	 * @param description
	 */
	private SanjeevniErrorCodes(HttpStatus httpStatus, String description) {
		this.httpStatus = httpStatus;
		this.statusCode = httpStatus.value();
		this.status = httpStatus.getReasonPhrase();
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	
	public String getHttpStatusInfo() {
		return String.format("%s [%s]", status, statusCode);
	}

	
	
	
}
