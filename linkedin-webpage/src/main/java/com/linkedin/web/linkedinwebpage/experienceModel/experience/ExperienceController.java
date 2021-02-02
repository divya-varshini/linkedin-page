package com.linkedin.web.linkedinwebpage.experienceModel.experience;


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

import com.linkedin.web.linkedinwebpage.experienceModel.company.Company;
import com.linkedin.web.linkedinwebpage.experienceModel.company.CompanyRepository;

import com.linkedin.web.linkedinwebpage.userModel.User;
import com.linkedin.web.linkedinwebpage.userModel.UserRepository;

@RestController
@RequestMapping("/experience")

public class ExperienceController {

	@Autowired
	private ExperienceService experienceService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@PostMapping
	public void createExperience(@RequestBody ExperienceSerializer experienceSerializer) {
		User user = userRepository.findByUsername(experienceSerializer.getUser()).get();
		
		Company company = companyRepository.findByCompanyName(experienceSerializer.getCompany()).get();
	
		Experience experience = new Experience(experienceSerializer.getRole(), 
				company, experienceSerializer.getDuration(), experienceSerializer.getStartDate(), 
				experienceSerializer.getEndDate(), user);
	
		Optional<Experience> existingExperience = experienceService.getExpByCompanyAndUser(company, user);
		
		if (existingExperience.isPresent()) {
			experience.setId(existingExperience.get().getId());
		}
		
		experienceService.addExperience(experience);
	
	}
	
	@GetMapping("/{id}")
    public Optional<Experience> getExperience(@PathVariable int id) {
        return experienceService.getExperience(id);
    }
	
	@GetMapping
    public List<Experience> getAllExperiences(@RequestParam("user") String username) {
        return experienceService.getAllExperiencesDetails(username);
    }
	
	@PutMapping("/{id}")
	public void updateExperience(@RequestBody ExperienceSerializer experienceSerializer, @PathVariable int id) {
		User user = userRepository.findByUsername(experienceSerializer.getUser()).get();
		
		Company company = companyRepository.findByCompanyName(experienceSerializer.getCompany()).get();
	
		Experience experience = new Experience(experienceSerializer.getRole(),
				company, experienceSerializer.getDuration(), experienceSerializer.getStartDate(), 
				experienceSerializer.getEndDate(), user);
		
		experience.setId(id);
		
		experienceService.updateExperience(experience);
	} 
	
	@DeleteMapping("/{id}")
	public void deleteExperience(@PathVariable int id) {
		experienceService.deleteExperience(id);
	}
	
}
