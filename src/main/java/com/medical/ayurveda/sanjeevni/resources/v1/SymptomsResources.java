package com.medical.ayurveda.sanjeevni.resources.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.ayurveda.sanjeevni.model.Symptoms;
import com.medical.ayurveda.sanjeevni.service.SymptomService;

import io.swagger.annotations.Api;


@Api(value = "Symptoms Resource")
@RequestMapping("/v1/redirect")
@RestController
public class SymptomsResources {

	@Autowired
	SymptomService symptomsService;
	
	
	
//	*********************** Adding a Symptoms  in AbstineceEntity **************************  //
	@PostMapping(value = "/symptoms")
	public void addSymptoms(@RequestBody Symptoms symptoms) {
		
		
//		System.out.println("hello");
		System.out.println("Body Part :: " + symptoms.getBodyPart());
		
		symptomsService.addSymptom(symptoms);
		
		
	} // DONE
	
	
//	*********************** Getting a Symptoms  in SymptomsEntity **************************  //
	@GetMapping(value = "/symptoms")
	public List<Symptoms> getAll() {							
		return symptomsService.getSymptom();
	} // DONE
	    
		
}
