package com.linkedin.web.linkedinwebpage.userModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@Column(unique = true)
	private String username;
	private String email;
	private String password;
	private String currentRole;
	private String address;
	private String description;
	@Column(unique = true)
	private Boolean active;
	
	public User() {}
	
	public User(Integer id, String name, String username, String email, String password, String currentRole,
			String address, String description, Boolean active) {
		
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.currentRole = currentRole;
		this.address = address;
		this.description = description;
		this.active = active;
	}
	
	public User(String username) {
        this.username = username;
    }
	
	//Id
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	//Name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	//Username
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	//Mail
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//Password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Current Role
	public String getCurrentRole() {
		return currentRole;
	}
	
	public void setCurrentRole(String currentRole) {
		this.currentRole = currentRole;
	}
	
	
	//Address
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	//Description
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Active
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
}
