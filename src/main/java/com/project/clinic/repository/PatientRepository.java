package com.project.clinic.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.time.LocalDateTime;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.project.clinic.PatientProjection;
import com.project.clinic.model.Patient;

@CrossOrigin
@RepositoryRestResource(excerptProjection=PatientProjection.class , path="patients", exported=true)
public interface PatientRepository extends CrudRepository<Patient, Long> {
	
	public PatientProjection findById(@Param("id") Long id);
	
	@RestResource(path = "byFilter")
	public List<Patient> findByPhoneContainingOrFirstNameContainingOrLastNameContaining(	
																		@Param("phone") String phone,
																		@Param("firstName") String firstName, 
																		@Param("lastName") String lastName);
	
	@RestResource(path = "byDate")
	public List<Patient> findByCreatedAtOrUpdatedAt(@Param("createdAt") @DateTimeFormat(pattern="yyyy-MM-dd") Date createdAt,
			@Param("updatedAt") @DateTimeFormat(pattern="yyyy-MM-dd") Date updatedAt);
}