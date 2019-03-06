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

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name="medicine")
public class Medicine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;


	@Column(name = "medicine_name", nullable = false, columnDefinition="VARCHAR(100)")
	private String medicine_name;
	
	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "med_description", unique = false, nullable = false)
	private String med_description;
	
	

	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "power",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Power power;
	
	@JsonIgnore
	@OneToMany(mappedBy="medicine", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private List<Doctor> doctor;
	
	
	@OneToOne(mappedBy="medicine", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private  Record record;
		
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "abstinence",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Abstinence abstinence;


	public Medicine() {
		super();
	}

	
	
	
	public Medicine(Integer id, String medicine_name, String med_description, Date created_date, Date updated_date,
			Power power, List<Doctor> doctor, Record record, Abstinence abstinence) {
		super();
		this.id = id;
		this.medicine_name = medicine_name;
		this.med_description = med_description;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.power = power;
		this.doctor = doctor;
		this.record = record;
		this.abstinence = abstinence;
	}




	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMedicine_name() {
		return medicine_name;
	}


	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}


	public String getMed_description() {
		return med_description;
	}


	public void setMed_description(String med_description) {
		this.med_description = med_description;
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


	public Power getPower() {
		return power;
	}


	public void setPower(Power power) {
		this.power = power;
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


	public Abstinence getAbstinence() {
		return abstinence;
	}


	public void setAbstinence(Abstinence abstinence) {
		this.abstinence = abstinence;
	}




	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medicine_name=" + medicine_name + ", med_description=" + med_description
				+ ", created_date=" + created_date + ", updated_date=" + updated_date + ", power=" + power + ", doctor="
				+ doctor + ", record=" + record + ", abstinence=" + abstinence + "]";
	}
	
	
	
	
	
}
