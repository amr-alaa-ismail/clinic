package com.project.clinic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.ManyToMany;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Data
@Entity(name="patients")
@EntityListeners(AuditingEntityListener.class)
@ToString
@NoArgsConstructor
public class Patient extends BaseEntity {
    
    @NonNull
    @Column(name = "phone", nullable=false, unique=true)
    private String phone;
	private String firstName;
	private String lastName;
	private int age;
	private SEX gender;
	private String fileNumber;
	private String address;
	@ManyToMany
	private List<Comment> comments;
	@ManyToMany
	private List<Diagnosis> diagnosis;
	
	public enum SEX {
		MALE, FEMALE
	}
}