package com.linkedin.web.linkedinwebpage.experienceModel.company;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Integer> {

	Optional<Company> findByCompanyName(String companyName);
}
