package com.xworkz.Company.Dao;

import com.xworkz.Company.CompanyEntity.CompanyEntity;

public interface CompanyDao {
	public void saveCompanyEntity(CompanyEntity companyEntity);

	public void deleteCompanyEntity(int cId);

	public void updateCompanyEntity(String cname,String grade);

	public void readCompanyEntity();

	public void readAllCompanyEntity();
}
