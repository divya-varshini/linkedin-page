package com.linkedin.web.linkedinwebpage.experienceModel.experience;

import java.util.List;
import java.util.Optional;


import org.springframework.data.repository.CrudRepository;

import com.linkedin.web.linkedinwebpage.experienceModel.company.*;
import com.linkedin.web.linkedinwebpage.userModel.User;

public interface ExperienceRepository extends CrudRepository <Experience, Integer>{
	
	List<Experience> findByUserUsername(String username);
	
	Optional<Experience> findByCompanyAndUser(Company company, User user);
}
