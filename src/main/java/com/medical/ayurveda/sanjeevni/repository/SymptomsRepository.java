/**
 * 
 */
package com.medical.ayurveda.sanjeevni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medical.ayurveda.sanjeevni.model.Symptoms;

/**
 * @author vkumar
 *
 */
public interface SymptomsRepository extends JpaRepository<Symptoms, Integer> {
	
	@Query(nativeQuery= true, value = "select s.symptom_name, bp.bodypart_name from symptoms as s inner join body_part as bp on bp.id = s.body_part ")
	public List<Symptoms> RetrieveAll();

}
