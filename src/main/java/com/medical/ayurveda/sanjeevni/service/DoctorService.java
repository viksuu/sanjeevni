package com.medical.ayurveda.sanjeevni.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.ayurveda.sanjeevni.model.Doctor;
import com.medical.ayurveda.sanjeevni.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository docRepo;
	
	/*Add Doctor*/
	public void doctor(Doctor doctor){
		
		Date created_date = new Date();
		Date update_date = new Date();
		
		doctor.setCreated_date(created_date);
		doctor.setUpdated_date(update_date);
		
		System.out.println("doctor Obj is ::" +doctor);
		docRepo.saveAndFlush(doctor);
		
	}
	

	/*Get Doctor*/
	public List<Doctor> getDoctor(){
//		List<Doctor> list=docRepo.findAll();
		List<Doctor> list=docRepo.RetrieveAll();
		 for(int i=0;i<list.size();i++){
            Doctor d=list.get(i);		
//            System.out.println("The doctor is :: "+d);
		 }
		 
		 return list;
	}
	
	
}
