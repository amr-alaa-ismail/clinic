package com.project.clinic.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity(name="comments")
public class Comment extends BaseEntity {
	
	private String comment;
}