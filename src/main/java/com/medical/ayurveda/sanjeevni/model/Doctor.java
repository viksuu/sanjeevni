package com.medical.ayurveda.sanjeevni.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;



@Component
@Entity
@Table(name="doctor")
public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "rating", unique = false, nullable = false, columnDefinition= "VARCHAR(100)")
	private Integer rating;
	

	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "symptoms",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Symptoms symptoms;
	
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JoinColumn(name = "medicine",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Medicine  medicine;
	
	
	public Doctor() {	
		super();
	}


	public Doctor(Integer id, Integer rating, Date created_date, Date updated_date, Symptoms symptom,
			Medicine medicine) {
		super();
		this.id = id;
		this.rating = rating;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.symptoms = symptom;
		this.medicine = medicine;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getRating() {
		return rating;
	}


	public void setRating(Integer rating) {
		this.rating = rating;
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


	public Symptoms getSymptoms() {
		return symptoms;
	}


	public void setSymptom(Symptoms symptom) {
		this.symptoms = symptom;
	}


	public Medicine getMedicine() {
		return medicine;
	}


	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", rating=" + rating + ", created_date=" + created_date + ", updated_date="
				+ updated_date + ", symptoms=" + symptoms + ", medicine=" + medicine + "]";
	}

	
	
	
}
