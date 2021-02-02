package com.linkedin.web.linkedinwebpage.experienceModel.experience;

public class ExperienceSerializer {

	private String role;
	private String user;
	private String company;
	private String duration;
	private String startDate;
	private String endDate;
	//private String description;
	public ExperienceSerializer(String role, String company, String duration, String startDate,
			String endDate, String user) {
		super();
		this.role = role;
		this.company = company;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		//this.description = description;
		this.user = user;
	}
	
	public ExperienceSerializer() {}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	//public String getDescription() {
		//return description;
	//}

	//public void setDescription(String description) {
		//this.description = description;
	//}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}

