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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name="contact")
public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "Contact_First_Name", nullable = false, columnDefinition="VARCHAR(100)")
	private String Contact_First_Name;
	
	@Column(name = "Contact_Middle_Name", nullable = true, columnDefinition="VARCHAR(100)")
	private String Contact_Middle_Name;
	
	@Column(name = "Contact_Last_Name", nullable = true, columnDefinition="VARCHAR(100)")
	private String Contact_Last_Name;
	
	@Column(name = "Contact_Email", nullable = false, columnDefinition="VARCHAR(30)")
	private String Contact_Email;
	
	@Column(name = "phone_No", nullable = false, columnDefinition="VARCHAR(30)")
	private String phoneNo;
	
	@Column(name = "address_Line_1", nullable = false, columnDefinition="VARCHAR(100)")
	private String address_Line_1;
	
	@Column(name = "address_Line_2", nullable = true, columnDefinition="VARCHAR(100)")
	private String address_Line_2;
	
	@Column(name = "address_Line_3", nullable = true, columnDefinition="VARCHAR(100)")
	private String address_Line_3;
	
	@Column(name = "city", nullable = false, columnDefinition="VARCHAR(30)")
	private String city;
	
	@Column(name = "state", nullable = false, columnDefinition="VARCHAR(20)")
	private String state;
	
	@Column(name = "postal_code", nullable = false, columnDefinition="VARCHAR(15)")
	private String postal_code;
	
	@Column(name = "country", nullable = false, columnDefinition="VARCHAR(30)")
	private String country;
	
	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;
	

	@OneToOne(mappedBy="contact", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private  Patient patient;
		
	
	public Contact() {
		super();
	}


	public Contact(Integer id, String contact_First_Name, String contact_Middle_Name, String contact_Last_Name,
			String contact_Email, String phoneNo, String address_Line_1, String address_Line_2, String address_Line_3,
			String city, String state, String postal_code, String country, Date created_date, Date updated_date,
			Patient patient) {
		super();
		this.id = id;
		Contact_First_Name = contact_First_Name;
		Contact_Middle_Name = contact_Middle_Name;
		Contact_Last_Name = contact_Last_Name;
		Contact_Email = contact_Email;
		this.phoneNo = phoneNo;
		this.address_Line_1 = address_Line_1;
		this.address_Line_2 = address_Line_2;
		this.address_Line_3 = address_Line_3;
		this.city = city;
		this.state = state;
		this.postal_code = postal_code;
		this.country = country;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.patient = patient;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getContact_First_Name() {
		return Contact_First_Name;
	}


	public void setContact_First_Name(String contact_First_Name) {
		Contact_First_Name = contact_First_Name;
	}


	public String getContact_Middle_Name() {
		return Contact_Middle_Name;
	}


	public void setContact_Middle_Name(String contact_Middle_Name) {
		Contact_Middle_Name = contact_Middle_Name;
	}


	public String getContact_Last_Name() {
		return Contact_Last_Name;
	}


	public void setContact_Last_Name(String contact_Last_Name) {
		Contact_Last_Name = contact_Last_Name;
	}


	public String getContact_Email() {
		return Contact_Email;
	}


	public void setContact_Email(String contact_Email) {
		Contact_Email = contact_Email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getAddress_Line_1() {
		return address_Line_1;
	}


	public void setAddress_Line_1(String address_Line_1) {
		this.address_Line_1 = address_Line_1;
	}


	public String getAddress_Line_2() {
		return address_Line_2;
	}


	public void setAddress_Line_2(String address_Line_2) {
		this.address_Line_2 = address_Line_2;
	}


	public String getAddress_Line_3() {
		return address_Line_3;
	}


	public void setAddress_Line_3(String address_Line_3) {
		this.address_Line_3 = address_Line_3;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPostal_code() {
		return postal_code;
	}


	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
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

	
	
}
