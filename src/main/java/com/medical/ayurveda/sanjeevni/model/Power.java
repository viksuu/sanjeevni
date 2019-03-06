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
@Table(name="power")
public class Power implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "power_value", nullable = false, columnDefinition="VARCHAR(10)")
	private String power_value;

	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "power_description", unique = false, nullable = true)
	private String power_description;
	
	

	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;

	@JsonIgnore
	@OneToMany(mappedBy="power", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private  List<Medicine> medicine;
	
	public Power() {
		super();
	}

	public Power(Integer id, String power_value, String power_description, Date created_date, Date updated_date) {
		super();
		this.id = id;
		this.power_value = power_value;
		this.power_description = power_description;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPower_value() {
		return power_value;
	}

	public void setPower_value(String power_value) {
		this.power_value = power_value;
	}

	public String getPower_description() {
		return power_description;
	}

	public void setPower_description(String power_description) {
		this.power_description = power_description;
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
