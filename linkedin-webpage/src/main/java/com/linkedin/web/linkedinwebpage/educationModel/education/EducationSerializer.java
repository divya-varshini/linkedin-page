package com.linkedin.web.linkedinwebpage.educationModel.education;

public class EducationSerializer {

	private String startDate;
	private String endDate;
	private String course;
	private String description;
	private String user;
	private String institute;
	
	public EducationSerializer(String startDate, String endDate, String course, String description, String institute, String user
			) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.description = description;
		this.user = user;
		this.institute = institute;
	}
	
	public EducationSerializer() {
		
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}
	
	
    
    
	
}
