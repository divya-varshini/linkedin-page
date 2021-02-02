package com.linkedin.web.linkedinwebpage.skillsModel;

//import com.linkedin.web.linkedinwebpage.userModel.User;

public class SkillsSerializer {
	private String name;
	private int level;
	private String type;
	private String user;
	public SkillsSerializer(String name, int level, String type, String user) {
		this.name = name;
		this.level = level;
		this.type = type;
		this.user = user;
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
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
