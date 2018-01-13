package com.project.clinic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="diagnosis")
public class Diagnosis extends BaseEntity {
	
	private String diagnosis;
}