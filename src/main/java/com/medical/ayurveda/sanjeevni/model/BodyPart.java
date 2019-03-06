package com.medical.ayurveda.sanjeevni.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Component
@Entity
@Table(name="BodyPart")
public class BodyPart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "bodypart_name",unique = true, nullable = false, columnDefinition="VARCHAR(100)")
	private String bodypart_name;

	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "bodyPart_description", unique = false, nullable = true)
	private String bodyPart_description;
	
	@Lob
	@Column(name = "acronyms", unique= false, nullable = true)
	private String acronyms;
	

	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;
	
	@JsonIgnore
	@OneToMany(mappedBy="bodyPart", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private  List<Symptoms> symptoms;
	
	

	public BodyPart() {
		super();
	}



	public BodyPart(Integer id, String bodypart_name, String bodyPart_description, String acronyms, Date created_date,
			Date updated_date, List<Symptoms> symptoms) {
		super();
		this.id = id;
		this.bodypart_name = bodypart_name;
		this.bodyPart_description = bodyPart_description;
		this.acronyms = acronyms;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.symptoms = symptoms;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getBodypart_name() {
		return bodypart_name;
	}



	public void setBodypart_name(String bodypart_name) {
		this.bodypart_name = bodypart_name;
	}



	public String getBodyPart_description() {
		return bodyPart_description;
	}



	public void setBodyPart_description(String bodyPart_description) {
		this.bodyPart_description = bodyPart_description;
	}



	public String getAcronyms() {
		return acronyms;
	}



	public void setAcronyms(String acronyms) {
		this.acronyms = acronyms;
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



	public List<Symptoms> getSymptoms() {
		return symptoms;
	}



	public void setSymptom(List<Symptoms> symptoms) {
		this.symptoms = symptoms;
	}



	@Override
	public String toString() {
		return "BodyPart [id=" + id + ", bodypart_name=" + bodypart_name + ", bodyPart_description="
				+ bodyPart_description + ", acronyms=" + acronyms + ", created_date=" + created_date + ", updated_date="
				+ updated_date + ", symptom=" + symptoms + "]";
	}



	
}
