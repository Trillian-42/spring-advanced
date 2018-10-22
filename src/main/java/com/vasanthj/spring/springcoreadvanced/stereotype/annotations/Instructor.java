package com.vasanthj.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") 
public class Instructor {

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;

	@Value("Vasanth")
	private String name;
	
	@Value("#{2+4>5}")
	private boolean active;
	
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	@Value("#{courses}") 
	private List<String> courses; 

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", profile=" + profile + ", courses=" + courses + "]";
	}

}
