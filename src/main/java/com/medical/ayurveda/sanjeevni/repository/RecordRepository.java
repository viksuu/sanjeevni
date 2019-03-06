/**
 * 
 */
package com.medical.ayurveda.sanjeevni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.ayurveda.sanjeevni.model.Record;

/**
 * @author vkumar
 *
 */
public interface RecordRepository extends JpaRepository<Record,Integer> {

}

