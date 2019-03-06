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
@Table(name="Abstinence")
public class Abstinence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

//	************************** Entity Column *****************************  //
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Lob // columnDefinition = "longtext" **** to increase the size of the body(lob extend the size upto 4GB)
	@Column(name = "abstinence_name", nullable = false, columnDefinition="VARCHAR(100)")
	private String abstinence_name;
	
	
	@Column(name = "created_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date created_date;
	
	
	@Column(name = "updated_date", nullable = false, columnDefinition= "TIMESTAMP")
	private Date updated_date;
	
	@JsonIgnore
	@OneToMany(mappedBy="abstinence", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},fetch = FetchType.LAZY)
	private  List<Medicine> medicine;
	
	
	public Abstinence() {
		super();
	}


	public Abstinence(Integer id, String abstinence_name, Date created_date, Date updated_date,
			List<Medicine> medicine) {
		super();
		this.id = id;
		this.abstinence_name = abstinence_name;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.medicine = medicine;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
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


	public List<Medicine> getMedicine() {
		return medicine;
	}


	public void setMedicine(List<Medicine> medicine) {
		this.medicine = medicine;
	}


	@Override
	public String toString() {
		return "Abstinence [id=" + id + ", abstinence_name=" + abstinence_name + ", created_date=" + created_date
				+ ", updated_date=" + updated_date + ", medicine=" + medicine + "]";
	}


	

}



/*   JSON input
{
    "abstinence_name": "alccobol"
    
}*/
