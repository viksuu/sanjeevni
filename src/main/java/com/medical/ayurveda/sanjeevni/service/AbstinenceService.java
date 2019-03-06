package com.medical.ayurveda.sanjeevni.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.ayurveda.sanjeevni.model.Abstinence;
import com.medical.ayurveda.sanjeevni.repository.AbstinenceRepository;


@Service
public class AbstinenceService {

	@Autowired
	AbstinenceRepository abstinenceRepo;
	
	
	/*Add Abstinence*/
	public void addAbstinence(Abstinence abstinence){
		
		Date created_date = new Date();
		Date update_date = new Date();
		
		abstinence.setCreated_date(created_date);
		abstinence.setUpdated_date(update_date);
		
		System.out.println("abstinence Obj is ::" +abstinence);
		abstinenceRepo.saveAndFlush(abstinence);
		
	}
	
	
	/*Update Abstinence*/
	public void updateAbstinence(Abstinence abstinence){
		
		
		Date update_date = new Date();
		abstinence.setUpdated_date(update_date);
		
		abstinenceRepo.saveAndFlush(abstinence);
		
	}
	
	
	/*Update Abstinence*/
	public List<Abstinence> getAbstinence(){
		
		return abstinenceRepo.findAll();
		
	}
	
	
	
}
