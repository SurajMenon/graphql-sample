package graphql.resolver;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import graphql.dao.CompanyDao;
import graphql.dao.PersonDao;
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

@Component
public class CompanyResolver implements GraphQLResolver<Company> {

	private PersonDao personDao = PersonDao.INSTANCE;

	//Getting company from person
	//For employee: [Person]!
	public List<Person> employee(Company c) {
		List<Person> p = personDao.personDb.values().stream().filter(x->x.getCompanyId().equals(c.getId())).collect(Collectors.toList());
		return p;
	}
}
