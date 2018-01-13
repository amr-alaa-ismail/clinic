package com.project.clinic.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id;
	
	@JsonIgnore
	@CreatedDate
	@Column(name = "created_at", nullable=false, updatable=false)
	@Temporal(TemporalType.DATE)
    protected Date createdAt;
	
	@JsonIgnore
    @Column(name = "updated_at")
    @LastModifiedDate
    @Temporal(TemporalType.DATE)
    protected Date updatedAt;
}