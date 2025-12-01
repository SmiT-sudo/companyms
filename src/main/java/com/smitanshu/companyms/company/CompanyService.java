package com.smitanshu.companyms.company;


import com.smitanshu.companyms.dto.ReviewMessage;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    boolean updateCompany(Company company, Long id);

    void createCompany(Company company);

    Company getCompanyById(Long id);

    Boolean deleteCompanyById(Long id);

    public void updateCompanyRating(ReviewMessage reviewMessage);

}
