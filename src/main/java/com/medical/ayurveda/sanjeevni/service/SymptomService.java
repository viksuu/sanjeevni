package com.medical.ayurveda.sanjeevni.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.ayurveda.sanjeevni.model.BodyPart;
import com.medical.ayurveda.sanjeevni.model.Symptoms;
import com.medical.ayurveda.sanjeevni.repository.BodyPartRepository;
import com.medical.ayurveda.sanjeevni.repository.SymptomsRepository;

@Service
public class SymptomService {
	
	
	@Autowired
	SymptomsRepository symptomRepo;
	
	@Autowired
	BodyPartRepository bodyPartRepo;
	
	
	/*Add Symptom*/
	public void addSymptom(Symptoms symptom){
		
		int bodyPartId = symptom.getBodyPartId();
		Date created_date = new Date();
		Date update_date = new Date();
		BodyPart bodyPart = bodyPartRepo.findOne(bodyPartId);
		
		
		symptom.setCreated_date(created_date);
		symptom.setUpdated_date(update_date);
		symptom.setBodyPart(bodyPart);
		
		System.out.println("symptoms Obj is ::" +symptom);
		
		
		
		symptomRepo.saveAndFlush(symptom);
		
	}
	
	
	/*Update Symptom*/
	public void updateSymptom(Symptoms symptom){
		
		
		Date update_date = new Date();
		symptom.setUpdated_date(update_date);
		
		symptomRepo.saveAndFlush(symptom);
		
	}
	
	
	/*Update Symptom*/
	public List<Symptoms> getSymptom(){
		
		return symptomRepo.findAll();
//		return symptomRepo.RetrieveAll();   it is not taking the SQL query from the native query . But in DB the query is correct.
		
	}

}

/*
 {
        "symptom_name": "leg pain",
        "symptom_description": "paer me dard",
        "acronyms": "leg pain",
        "bodyPartId" : 4
        
 }
*/