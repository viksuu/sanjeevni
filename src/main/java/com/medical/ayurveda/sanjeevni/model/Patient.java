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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;



@Component
@Entity
@Table(name="patient")
public class Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "patient_status", nullable = false, columnDefinition="VARCHAR(100)")
	private String patient_status;
	
	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "Earlier_Track_Description", unique = false, nullable = false)
	private String Earlier_Track_Description;
	
	
	@Column(name = "visited", nullable = true, columnDefinition= "VARCHAR(100)")
	private Integer visited;
		

	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;

	@JsonBackReference
	@OneToMany(mappedBy="patient", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private  List<Record> record;
	
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "contact",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Contact contact;
	
	
	public Patient() {
		super();
	}


	public Patient(Integer id, String patient_status, String earlier_Track_Description, Integer visited,
			Date created_date, Date updated_date, List<Record> record, Contact contact) {
		super();
		this.id = id;
		this.patient_status = patient_status;
		Earlier_Track_Description = earlier_Track_Description;
		this.visited = visited;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.record = record;
		this.contact = contact;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getPatient_status() {
		return patient_status;
	}


	public void setPatient_status(String patient_status) {
		this.patient_status = patient_status;
	}


	public String getEarlier_Track_Description() {
		return Earlier_Track_Description;
	}


	public void setEarlier_Track_Description(String earlier_Track_Description) {
		Earlier_Track_Description = earlier_Track_Description;
	}


	public Integer getVisited() {
		return visited;
	}


	public void setVisited(Integer visited) {
		this.visited = visited;
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


	public List<Record> getRecord() {
		return record;
	}


	public void setRecord(List<Record> record) {
		this.record = record;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
}
