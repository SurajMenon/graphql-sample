package graphql;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import graphql.dao.CompanyDao;
import graphql.pojo.Company;
import graphql.pojo.Person;

/**
 * Sometimes, the value of a field is non-trivial to load. This might involve
 * database lookups, complex calculations, or anything else. GraphQL Tools has a
 * concept of a field resolver that is used for this purpose
 * 
 * @param person
 * @return
 */

public class PersonResolver implements GraphQLResolver<Person> {

	private CompanyDao companyDao = CompanyDao.INSTANCE;

	public Company getCompany(Person person) {
		return companyDao.geCompanyById(person.getCompanyId());
	}
}
