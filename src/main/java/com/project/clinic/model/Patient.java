package com.project.clinic.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@Entity(name="patients")
@EntityListeners(AuditingEntityListener.class)
public class Patient extends BaseEntity {
    
    @NonNull
    @Column(name = "phone", nullable=false, unique=true)
    private String phone;
	private String firstName;
	private String lastName;
	private int age;
	private SEX gender;
	private String fileNumber;
	@ManyToMany
	private List<Comment> comments;
	@ManyToMany
	private List<Diagnosis> diagnosis;
	
	public enum SEX {
		MALE, FEMALE
	}
}