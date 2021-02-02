package com.linkedin.web.linkedinwebpage.educationModel.education;

import java.util.List;
import java.util.Optional;

//import org.apache.catalina.User;
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

import com.linkedin.web.linkedinwebpage.educationModel.institute.Institute;
import com.linkedin.web.linkedinwebpage.educationModel.institute.InstituteRepository;
import com.linkedin.web.linkedinwebpage.userModel.User;
import com.linkedin.web.linkedinwebpage.userModel.UserRepository;

@RestController
@RequestMapping("/education")
public class EducationController {

	@Autowired
	private EducationService educationService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private InstituteRepository instituteRepository;
	
	@PostMapping
	public void createEducation(@RequestBody EducationSerializer educationSerializer) {
		User user = userRepository.findByUsername(educationSerializer.getUser()).get();
		
		Institute institute = instituteRepository.findByInstituteName(educationSerializer.getInstitute()).get();
		
		Education education = new Education (educationSerializer.getStartDate (), educationSerializer.getEndDate(), 
				educationSerializer.getCourse(), educationSerializer.getDescription(), institute, user);
		
		Optional<Education> existingEducation = educationService.getByOrganizationAndUser(institute, user);
        
		if (existingEducation.isPresent()) {
        	education.setId(existingEducation.get().getId());
        }
		
		educationService.addEducation(education);
	}
	
	@GetMapping("/{id}")
    public Optional<Education> getEducation(@PathVariable int id) {
        return educationService.getEducation(id);
    }
	
	@GetMapping("/all")
	public List<Education> getAllEducations(@RequestParam ("user") String username) {
		return educationService.getAllEducationDetails(username);
	}
	
	@PutMapping("/{id}")
	public void updateEdu(@RequestBody EducationSerializer educationSerializer, @PathVariable Integer id) {
		User user = userRepository.findByUsername(educationSerializer.getUser()).get();
		
		Institute institute = instituteRepository.findByInstituteName(educationSerializer.getInstitute()).get();
		
		Education education = new Education (educationSerializer.getStartDate (), educationSerializer.getEndDate(), 
				educationSerializer.getCourse(), educationSerializer.getDescription(), institute, user);
		
		education.setId(id);

		educationService.updateEducation(education);
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteEducation (@PathVariable int id) {
		educationService.deleteEducation(id);
	}
}
