/**
 * 
 */
package com.medical.ayurveda.sanjeevni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.medical.ayurveda.sanjeevni.model.Doctor;

/**
 * @author vkumar
 *
 */
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
	@Query(nativeQuery= true, value = "select d.rating, m.medicine_name, s.symptom_name from ((doctor as d  inner join symptoms as s on s.id = d.symptoms)left join medicine as m on m.id = d.medicine)  ")
	public List<Doctor> RetrieveAll();

}
