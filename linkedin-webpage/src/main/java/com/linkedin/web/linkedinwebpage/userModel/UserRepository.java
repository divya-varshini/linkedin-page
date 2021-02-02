package com.linkedin.web.linkedinwebpage.userModel;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> findByUsername(String username);
	
}
