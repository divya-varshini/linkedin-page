package com.linkedin.web.linkedinwebpage.skillsModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.linkedin.web.linkedinwebpage.userModel.User;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int level;
	private String type;
	
	@ManyToOne 
	private User user;

	public Skills(String name, int level, String type, User user) {
		super();
		this.name = name;
		this.level = level;
		this.type = type;
		this.user = user;
	}

	public Skills() {}
	
	//ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Level
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	//Type
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//User
	public String getUser() {
		return user.getUsername();
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
