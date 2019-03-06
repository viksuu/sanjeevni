package com.medical.ayurveda.sanjeevni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.ayurveda.sanjeevni.model.PatientStatus;

public interface StatusRepository extends JpaRepository<PatientStatus, Integer> {

}
