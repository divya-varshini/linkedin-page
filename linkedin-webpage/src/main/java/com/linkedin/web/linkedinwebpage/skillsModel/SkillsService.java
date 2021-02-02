package com.linkedin.web.linkedinwebpage.skillsModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class SkillsService {
	
	@Autowired
	private SkillsRepository skillRepository;
	
	public void addSkill(Skills skill) {
		skillRepository.save(skill);
	}
	
	public Optional<Skills> getSkill(Integer id) {
		return skillRepository.findById(id);
	}
	
	public List<Skills> getAllSkills(String username) {
		List<Skills> skills = new ArrayList<>();
		skillRepository.findByUserUsername(username).forEach(skills :: add);
		return skills;
	}
	
	public Optional<Skills> getByType(String type) {
		return skillRepository.getByType(type);
	}
	
	public void updateSkills(Skills skill) {
		skillRepository.save(skill);
	}
	
	public void deleteSkills(Integer id) {
		skillRepository.deleteById(id);
	}
}
