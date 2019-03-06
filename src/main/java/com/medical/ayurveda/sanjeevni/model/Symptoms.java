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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Component
@Entity
@Table(name="symptoms")
public class Symptoms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "symptom_name", nullable = false, columnDefinition="VARCHAR(100)")
	private String symptom_name;

	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "symptom_description", unique = false, nullable = true)
	private String symptom_description;
	
	@Lob
	@Column(name = "acronyms", unique= false, nullable = true)
	private String acronyms;
	
	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;

	@Transient
	private int bodyPartId;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "bodyPart",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private BodyPart bodyPart;
	
	@JsonIgnore
	@OneToMany(mappedBy="symptoms", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Doctor> doctor;

	@JsonIgnore
	@OneToOne(mappedBy="symptoms", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	private Record record;
	
	public Symptoms() {
		super();
	} 

	public Symptoms(Integer id, String symptom_name, String symptom_description, String acronyms, Date created_date,
			Date updated_date, BodyPart bodyPart, List<Doctor> doctor, Record record) {
		super();
		this.id = id;
		this.symptom_name = symptom_name;
		this.symptom_description = symptom_description;
		this.acronyms = acronyms;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.bodyPart = bodyPart;
		this.doctor = doctor;
		this.record = record;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymptom_name() {
		return symptom_name;
	}

	public void setSymptom_name(String symptom_name) {
		this.symptom_name = symptom_name;
	}

	public String getSymptom_description() {
		return symptom_description;
	}

	public void setSymptom_description(String symptom_description) {
		this.symptom_description = symptom_description;
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

	public int getBodyPartId() {
		return bodyPartId;
	}

	public void setBodyPartId(int part) {
		this.bodyPartId = part;
	}

	public BodyPart getBodyPart() {
		return bodyPart;
	}

	public void setBodyPart(BodyPart bodyPart) {
		this.bodyPart = bodyPart;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}



	

}
