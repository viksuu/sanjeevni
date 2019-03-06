package com.medical.ayurveda.sanjeevni.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.ayurveda.sanjeevni.model.Power;
import com.medical.ayurveda.sanjeevni.repository.PowerRepository;


@Service
public class PowerService {

	@Autowired
	PowerRepository powerRepo;
	
	
	/*Add Abstinence*/
	public void addPower(Power power){
		
		Date created_date = new Date();
		Date update_date = new Date();
		
		power.setCreated_date(created_date);
		power.setUpdated_date(update_date);
		
		System.out.println("Power Obj is ::" +power);
		powerRepo.saveAndFlush(power);
		
	}
	
	
	/*Update Abstinence*/
	public void updateAbstinence(Power power){
		
		
		Date update_date = new Date();
		power.setUpdated_date(update_date);
		
		powerRepo.saveAndFlush(power);
		
	}
	
	
	/*Get all Abstinence*/
	public List<Power> getPower(){
	
		return powerRepo.findAll();
		
	}
	
	
	
}


/* JSON Input
{
    "power_description": "20",
    "power_value" : "20"
    
}*/
