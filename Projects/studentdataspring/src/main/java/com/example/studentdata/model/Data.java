package com.example.studentdata.model;

import jakarta.persistence.*;

@Entity
@Table(name = "studentdata")
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "course")
	private String course;
		
	@Column(name = "result")
	private boolean result;
	

	@Column(name = "description")
	private String description;


	public Data(long id, String name, String course, boolean result, String description) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.result = result;
		this.description = description;
	}


	public Data(String name2, boolean result2) {
		// TODO Auto-generated constructor stub
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public boolean isResult() {
		return result;
	}


	public void setResult(boolean result) {
		this.result = result;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", course=" + course + ", result=" + result + ", description="
				+ description + "]";
	}
}
	
	