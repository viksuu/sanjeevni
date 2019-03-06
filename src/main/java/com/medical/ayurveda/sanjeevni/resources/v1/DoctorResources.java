package com.medical.ayurveda.sanjeevni.resources.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.ayurveda.sanjeevni.model.Doctor;
import com.medical.ayurveda.sanjeevni.service.DoctorService;

@RestController
public class DoctorResources {
	
	@Autowired
	Doctor doctor;
	@Autowired
	DoctorService doctorService;
	
	
	
	
//	*********************** Getting a Symptoms  in SymptomsEntity **************************  //
	@GetMapping(value = "/doctor")
	public List<Doctor> getAll() {	
	 List<Doctor> doc=doctorService.getDoctor() ;
	 return doc;
	} // DONE
	    

}
