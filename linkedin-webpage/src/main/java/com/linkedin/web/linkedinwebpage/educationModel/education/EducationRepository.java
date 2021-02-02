package com.linkedin.web.linkedinwebpage.educationModel.education;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import com.linkedin.web.linkedinwebpage.educationModel.institute.Institute;
import com.linkedin.web.linkedinwebpage.userModel.User;

public interface EducationRepository extends CrudRepository<Education, Integer> {
	List<Education> findByUserUsername(String username);
	
	Optional<Education> findByInstituteAndUser(Institute instituteId, User user);
}
