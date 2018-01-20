package com.project.clinic.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity(name="diagnosis")
public class Diagnosis extends BaseEntity {
	
	private String diagnosis;
}