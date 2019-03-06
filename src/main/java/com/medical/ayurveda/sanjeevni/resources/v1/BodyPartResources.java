package com.medical.ayurveda.sanjeevni.resources.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medical.ayurveda.sanjeevni.model.BodyPart;
import com.medical.ayurveda.sanjeevni.service.BodyPartService;

@RestController
public class BodyPartResources {

	@Autowired
	BodyPartService bodyPartService;
	
	
	
//	*********************** Adding a BodyPart  in AbstineceEntity **************************  //
	@PostMapping(value = "/bodyPart")
	public void addBodyPart(@RequestBody BodyPart bodyPart) {
		
		System.out.println("hello");
		System.out.println("abstin" + bodyPart);
		bodyPartService.addBodyPart(bodyPart);
		
		
	} // DONE
	
	
//	*********************** Adding a BodyPart  in AbstineceEntity **************************  //
	@GetMapping(value = "/bodyPart")
	public List<BodyPart> getAll() {							
		return bodyPartService.getBodyPart();
	} // DONE
	
	
	
}
