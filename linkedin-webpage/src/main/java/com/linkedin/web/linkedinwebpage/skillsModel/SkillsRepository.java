package com.linkedin.web.linkedinwebpage.skillsModel;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;



public interface SkillsRepository extends CrudRepository<Skills, Integer>{

	Optional<Skills> getByType(String type);

	List<Skills> findByUserUsername(String username);

	
	
	
}
