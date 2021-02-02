package com.linkedin.web.linkedinwebpage.educationModel.institute;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.linkedin.web.linkedinwebpage.educationModel.education.Education;

@Entity
public class Institute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private String instituteName;
	private String name;
	private String location;
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "institute")
	private List<Education> education;
	
	public Institute(String instituteName, String name, String location, String description) {
		super();
		this.instituteName = instituteName;
		this.name = name;
		this.location = location;
		this.description = description;
	}

	public Institute () {}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getInstituteName() {
		return instituteName;
	}


	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}


	public String getName() {
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}
