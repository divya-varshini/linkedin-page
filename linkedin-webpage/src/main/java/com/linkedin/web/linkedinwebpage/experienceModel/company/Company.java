package com.linkedin.web.linkedinwebpage.experienceModel.company;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String companyName;
	private String name;
	private String location;
	private String desciption;
	public Company( String companyName, String name, String location, String desciption) {
		this.companyName = companyName;
		this.name = name;
		this.location = location;
		this.desciption = desciption;
	}
	
	public Company() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	
	
}
