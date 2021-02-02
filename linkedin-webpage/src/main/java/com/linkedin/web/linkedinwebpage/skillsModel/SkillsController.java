package com.linkedin.web.linkedinwebpage.skillsModel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.linkedin.web.linkedinwebpage.userModel.User;
import com.linkedin.web.linkedinwebpage.userModel.UserRepository;

@RestController
@RequestMapping(value = "/skills")
public class SkillsController {
	
	@Autowired
	private SkillsService skillsService;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public void createSkill(@RequestBody SkillsSerializer skillsSerializer) {
		User user = userRepository.findByUsername(skillsSerializer.getUser()).get();
        Skills newSkill = new Skills(skillsSerializer.getName(), skillsSerializer.getLevel(), skillsSerializer.getType(), user);
        skillsService.addSkill(newSkill);
	}
	
	@GetMapping("/{id}")
    	public Optional<Skills> getASkill(@PathVariable Integer id ){
        	return skillsService.getSkill(id);
    	}
	
	@GetMapping
    	public List<Skills> getAllTheSkills(@RequestParam("user") String username){
        	return skillsService.getAllSkills(username);
    	}

    
    	@PutMapping("/{id}")
    	public void updateSkill(@RequestBody SkillsSerializer skill, @PathVariable Integer id) {
    		User user = userRepository.findByUsername(skill.getUser()).get();
        	Skills newSkill = new Skills(skill.getName(), skill.getLevel(), skill.getType(), user);
        	skillsService.addSkill(newSkill);
    	}
    
    	@DeleteMapping("/{id}")
    	public void deleteSkill(@PathVariable Integer id) {
        	skillsService.deleteSkills(id);
    	}
}
