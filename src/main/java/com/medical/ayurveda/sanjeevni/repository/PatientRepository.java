/**
 * 
 */
package com.medical.ayurveda.sanjeevni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.ayurveda.sanjeevni.model.Patient;

/**
 * @author vkumar
 *
 */
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
