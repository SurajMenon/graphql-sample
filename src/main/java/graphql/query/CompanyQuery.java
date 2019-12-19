package graphql.query;


import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graphql.dao.CompanyDao;
import graphql.pojo.Company;

//See : baeldung.com/spring-graphql

@Component
public class CompanyQuery implements GraphQLQueryResolver {

	private CompanyDao companyDao = CompanyDao.INSTANCE;
	
	//implements :: allCompany(): [Company]!
	public List<Company> allCompany() {
        return companyDao.getAllCompany();
    }
	
}
