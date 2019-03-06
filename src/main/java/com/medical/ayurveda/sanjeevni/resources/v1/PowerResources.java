package com.medical.ayurveda.sanjeevni.resources.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medical.ayurveda.sanjeevni.model.Power;
import com.medical.ayurveda.sanjeevni.service.PowerService;

@RestController
public class PowerResources {

	@Autowired
	PowerService powerService;
	
	
	
//	*********************** Adding a Power  in AbstineceEntity **************************  //
	@PostMapping(value = "/power")
	public void addPower(@RequestBody Power power) {
		
		System.out.println("hello");
		System.out.println("abstin" + power);
		powerService.addPower(power);
		
		
	} // DONE
	
	
//	*********************** Adding a Power  in AbstineceEntity **************************  //
	@GetMapping(value = "/power")
	public List<Power> getAll() {							
		return powerService.getPower();
	} // DONE
	
	
	
	
	
	
}
