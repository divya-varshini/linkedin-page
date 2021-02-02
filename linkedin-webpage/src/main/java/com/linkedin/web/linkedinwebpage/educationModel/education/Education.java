package com.linkedin.web.linkedinwebpage.educationModel.education;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.linkedin.web.linkedinwebpage.educationModel.institute.Institute;
import com.linkedin.web.linkedinwebpage.userModel.User;

@Entity
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String startDate;
	private String endDate;
	private String course;
	private String description;
	
	@ManyToOne
	private Institute institute;
	
	@ManyToOne
	private User user;

	public Education(String startDate, String endDate, String course, String description,
			Institute institute, User user) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.description = description;
		this.institute = institute;
		this.user = user;
	}
	
	public Education () {}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Institute getInstitute() {
		return this.institute;
	}

	public void setInstitude(Institute institute) {
		this.institute = institute;
	}

	public String getUser() {
		return this.user.getUsername();
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
