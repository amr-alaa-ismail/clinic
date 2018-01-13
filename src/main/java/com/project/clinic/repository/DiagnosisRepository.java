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

import com.project.clinic.model.Diagnosis;
import com.project.clinic.model.Patient;

@CrossOrigin
@RepositoryRestResource(path="diagnosis", exported=true)
public interface DiagnosisRepository extends CrudRepository<Diagnosis, Long> {
	
}