package graphql.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.pojo.Company;

public enum CompanyDao {
	INSTANCE;

	public Map<String,Company> companyDb = new HashMap<>();
	
	public Company geCompanyById(String companyId) {
		return companyDb.get(companyId);
	}

	
	public List<Company> getAllCompany() {
		return new ArrayList<Company>(companyDb.values());
	}
}
