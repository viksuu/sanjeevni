package com.medical.ayurveda.sanjeevni.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.ayurveda.sanjeevni.model.BodyPart;
import com.medical.ayurveda.sanjeevni.repository.BodyPartRepository;


@Service
public class BodyPartService {

	@Autowired
	BodyPartRepository bodyPartRepo;
	
	
	/*Add BodyPart*/
	public void addBodyPart(BodyPart bodyPart){
		
		Date created_date = new Date();
		Date update_date = new Date();
		
		bodyPart.setCreated_date(created_date);
		bodyPart.setUpdated_date(update_date);
		
		System.out.println("bodyPart Obj is ::" +bodyPart);
		bodyPartRepo.saveAndFlush(bodyPart);
		
	}
	
	
	/*Update BodyPart*/
	public void updateBodyPart(BodyPart bodyPart){
		
		
		Date update_date = new Date();
		bodyPart.setUpdated_date(update_date);
		
		bodyPartRepo.saveAndFlush(bodyPart);
		
	}
	
	
	/*Get BodyPart*/
	public List<BodyPart> getBodyPart(){
		
		return bodyPartRepo.findAll();
		
	}
	
	
	
}

/*
{
    "bodypart_name": "eye",
    "bodyPart_description": "eye",
    "acronyms": "eye"
    
}*/


