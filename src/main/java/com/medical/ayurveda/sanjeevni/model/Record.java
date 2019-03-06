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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;



@Component
@Entity
@Table(name="record")
public class Record implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "NXT_appointment", nullable = false, columnDefinition= "TIMESTAMP")
	private Date NXT_appointment;

	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "advice", unique = false, nullable = false)
	private String advice;
	
	@Column(name = "Fee", nullable = true, columnDefinition="VARCHAR(100)")
	private Integer Fee;
	
	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "patient",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private  Patient patient ;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "symptoms",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private Symptoms symptoms;
	
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "medicine",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private  Medicine medicine ;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "status",  nullable = false)
	@JsonFormat(shape=JsonFormat.Shape.STRING)
	private  PatientStatus patientStatus;
	
	
	
	public Record() {
		super();
	}



	public Record(Integer id, Date nXT_appointment, String advice, Integer fee, Date created_date, Date updated_date,
			Patient patient, Symptoms symptom, Medicine medicine, PatientStatus patientStatus) {
		super();
		this.id = id;
		NXT_appointment = nXT_appointment;
		this.advice = advice;
		Fee = fee;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.patient = patient;
		this.symptoms = symptom;
		this.medicine = medicine;
		this.patientStatus = patientStatus;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Date getNXT_appointment() {
		return NXT_appointment;
	}



	public void setNXT_appointment(Date nXT_appointment) {
		NXT_appointment = nXT_appointment;
	}



	public String getAdvice() {
		return advice;
	}



	public void setAdvice(String advice) {
		this.advice = advice;
	}



	public Integer getFee() {
		return Fee;
	}



	public void setFee(Integer fee) {
		Fee = fee;
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



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	public Symptoms getSymptom() {
		return symptoms;
	}



	public void setSymptom(Symptoms symptom) {
		this.symptoms= symptom;
	}



	public Medicine getMedicine() {
		return medicine;
	}



	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}



	public PatientStatus getPatientStatus() {
		return patientStatus;
	}



	public void setPatientStatus(PatientStatus patientStatus) {
		this.patientStatus = patientStatus;
	}

	
	
	
}
