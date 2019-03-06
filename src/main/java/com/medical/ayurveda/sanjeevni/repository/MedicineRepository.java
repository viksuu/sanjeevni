/**
 * 
 */
package com.medical.ayurveda.sanjeevni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.ayurveda.sanjeevni.model.Medicine;


/**
 * @author vkumar
 *
 */
public interface MedicineRepository  extends JpaRepository<Medicine, Integer> {
	


}
