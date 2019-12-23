package graphql.mutation;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import graphql.dao.CompanyDao;
import graphql.dao.PersonDao;
import graphql.pojo.Company;
import graphql.pojo.Person;

@Component
public class PersonMutation implements GraphQLMutationResolver {

	private PersonDao personDao = PersonDao.INSTANCE;

	// implements :: addPerson(name: String!,age: Int!): Person!
	public Person addPerson(String name, Integer age) {
		String id = UUID.randomUUID().toString();
		Person p = new Person(id, name, age);
		return personDao.addPerson(p);
	}

	// implements :: addPersonWithCompany(name: String!,age: Int!, companyId:String!): Person!
	public Person addPersonWithCompany(String name, Integer age, String companyId) {
		String id = UUID.randomUUID().toString();
		Person p = new Person(id, name, age, companyId);
		return personDao.addPerson(p);
	}

}
