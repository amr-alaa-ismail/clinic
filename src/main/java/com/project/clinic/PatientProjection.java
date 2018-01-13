package com.project.clinic;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.project.clinic.model.Comment;
import com.project.clinic.model.Diagnosis;
import com.project.clinic.model.Patient;
import com.project.clinic.model.Patient.SEX;

@Projection(name = "fullPatient", types = { Patient.class })
public interface PatientProjection {
	int getId();
	Date getCreatedAt();
	Date getUpdatedAt();
	String getPhone();
	String getFirstName();
	String getLastName();
	int getAge();
	SEX getGender();
	String getFileNumber();
	@Value("#{target.comments}")
	List<Comment> getComments();
	@Value("#{target.diagnosis}")
	List<Diagnosis> getDiagnosis();
}
