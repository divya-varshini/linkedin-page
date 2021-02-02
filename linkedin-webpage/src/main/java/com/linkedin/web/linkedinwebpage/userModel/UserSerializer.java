package com.linkedin.web.linkedinwebpage.userModel;

public class UserSerializer {
	private String name;
	private String username;
	private String email;
	private String password;
	private String currentRole;
	private String address;
	private String description;	
	private Boolean active;
	
	
	public UserSerializer(String name, String username, String email, String password, String currentRole,
			String address, String description, Boolean active) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.currentRole = currentRole;
		this.address = address;
		this.description = description;
		this.active = active;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCurrentRole() {
		return currentRole;
	}


	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Boolean getActive() {
		return active;
	}


	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
}
