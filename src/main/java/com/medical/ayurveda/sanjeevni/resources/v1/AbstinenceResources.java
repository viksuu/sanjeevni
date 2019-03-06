package com.medical.ayurveda.sanjeevni.resources.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medical.ayurveda.sanjeevni.model.Abstinence;
import com.medical.ayurveda.sanjeevni.service.AbstinenceService;

@RestController
public class AbstinenceResources {

	@Autowired
	AbstinenceService abstineceService;
	
	
	
//	*********************** Adding a Abstinence  in AbstineceEntity **************************  //
	@PostMapping(value = "/abstinence")
	public void addAbstinence(@RequestBody Abstinence abstinence) {
		
		System.out.println("hello");
		System.out.println("abstin" + abstinence);
		abstineceService.addAbstinence(abstinence);
		
		
	} // DONE
	
	
//	*********************** Adding a Abstinence  in AbstineceEntity **************************  //
	@GetMapping(value = "/abstinence")
	public List<Abstinence> getAll() {							
		return abstineceService.getAbstinence();
	} // DONE
	
	
	
	
	
	
}
