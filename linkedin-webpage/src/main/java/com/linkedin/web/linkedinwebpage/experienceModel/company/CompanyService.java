package com.linkedin.web.linkedinwebpage.experienceModel.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;
	
	public void addCompany(Company company) {
        companyRepository.save(company);
    }

	public Optional<Company> getCompany(String companyName) {
        return companyRepository.findByCompanyName(companyName);
        
    }

	
	public List<Company> getAllCompanies() {
		List <Company> companies = new ArrayList<>();
		companyRepository.findAll().forEach(companies :: add);
		return companies;
	}
	
	public void updateCompany(Company company) {
        companyRepository.save(company);
    }
	
	public void deleteCompany(int companyName) {
		companyRepository.deleteById(companyName);
	}
}
