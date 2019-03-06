/**
 * 
 */
package com.medical.ayurveda.sanjeevni.DTO;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author vkumar
 *
 */
public class AbstinenceDTO implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String abstinence_name;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")   
	private Date created_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")   
	private Date updated_date;

	public AbstinenceDTO() {
		super();
	}

	public AbstinenceDTO(int id, String abstinence_name, Date created_date, Date updated_date) {
		super();
		this.id = id;
		this.abstinence_name = abstinence_name;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAbstinence_name() {
		return abstinence_name;
	}

	public void setAbstinence_name(String abstinence_name) {
		this.abstinence_name = abstinence_name;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	
	
	
}
