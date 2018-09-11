package com.quest.SampleApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample {

	@Id
	private String field;
	private String name;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
