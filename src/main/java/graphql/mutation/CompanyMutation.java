package graphql.mutation;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import graphql.dao.CompanyDao;
import graphql.pojo.Company;

@Component
public class CompanyMutation implements GraphQLMutationResolver {

	private CompanyDao companyDao = CompanyDao.INSTANCE;

	// implements :: addCompany(name: String!): Company!
	public Company addCompany(String name) {
		String id = UUID.randomUUID().toString();
		Company c = new Company(id, name);
		return companyDao.addCompany(c);
	}

}
