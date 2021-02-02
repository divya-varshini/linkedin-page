package com.linkedin.web.linkedinwebpage.experienceModel.experience;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.linkedin.web.linkedinwebpage.experienceModel.company.Company;
import com.linkedin.web.linkedinwebpage.userModel.User;

@Entity
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String role;
		
	private String duration;
	private String startDate;
	private String endDate;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Company company;

	
	public Experience(String role, Company company, String duration, String startDate,
			String endDate, User user) {
		super();
		this.role = role;
		this.company = company;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		
		this.user = user;
	}

	public Experience () {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	
	
	public String getUser() {
		return user.getUsername();
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}

