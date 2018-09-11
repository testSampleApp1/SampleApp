package com.quest.SampleApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quest.SampleApp.model.Sample;

@Repository
	public interface MyRepository extends CrudRepository<Sample, Long> {

	String findByName(String string);

	}

