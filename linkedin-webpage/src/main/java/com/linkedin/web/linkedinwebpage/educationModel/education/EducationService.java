package com.linkedin.web.linkedinwebpage.educationModel.education;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkedin.web.linkedinwebpage.educationModel.institute.Institute;
import com.linkedin.web.linkedinwebpage.userModel.User;

@Service
public class EducationService {
	
	@Autowired
	private EducationRepository educationRepository;
	
	public void addEducation(Education education) {
		educationRepository.save(education);
	}
	
	public List<Education> getAllEducationDetails(String username) {
		List<Education> educationDetails = new ArrayList<>();
		educationRepository.findByUserUsername(username).forEach(educationDetails :: add);
		return educationDetails;
	}
	
	public Optional<Education> getEducation(Integer id) {
        return educationRepository.findById(id);
    }

	public Optional<Education> getByOrganizationAndUser(Institute institute, User user) {
        return educationRepository.findByInstituteAndUser(institute, user);
    }

	public void updateEducation(Education education) {
        educationRepository.save(education);
    }
	
	public void deleteEducation(int id) {
        educationRepository.deleteById(id);
    }
}
