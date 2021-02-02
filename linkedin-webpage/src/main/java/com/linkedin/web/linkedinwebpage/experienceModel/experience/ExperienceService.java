package com.linkedin.web.linkedinwebpage.experienceModel.experience;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkedin.web.linkedinwebpage.experienceModel.company.Company;
import com.linkedin.web.linkedinwebpage.userModel.User;

@Service
public class ExperienceService {

	@Autowired
	private ExperienceRepository experienceRepository;
	
	public void addExperience (Experience experience) {
		experienceRepository.save(experience);
	}
	
	public List<Experience> getAllExperiencesDetails(String username) {
        List<Experience> experiences = new ArrayList<>();
        experienceRepository.findByUserUsername(username).forEach(experiences::add);
        return experiences;
    }

	public Optional<Experience> getExperience(Integer id) {
        return experienceRepository.findById(id);
    }

	public Optional<Experience> getExpByCompanyAndUser(Company company, User user) {
        return experienceRepository.findByCompanyAndUser(company, user);
    }

	public void updateExperience(Experience experience) {
        experienceRepository.save(experience);
    }
	
	public void deleteExperience(int id) {
        experienceRepository.deleteById(id);
    }
	
}

