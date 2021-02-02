package com.linkedin.web.linkedinwebpage.educationModel.institute;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;


public interface InstituteRepository extends CrudRepository<Institute, String> {

	Optional<Institute> findByInstituteName(String instituteName);
	
}
