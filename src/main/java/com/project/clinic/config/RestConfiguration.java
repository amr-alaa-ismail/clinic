package com.project.clinic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.project.clinic.PatientProjection;
import com.project.clinic.model.Comment;
import com.project.clinic.model.Diagnosis;

@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter {
    @Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(PatientProjection.class);
        config.exposeIdsFor(Comment.class);
        config.exposeIdsFor(Diagnosis.class);
        
    }
}