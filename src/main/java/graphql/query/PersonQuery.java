package graphql.query;


import java.util.List;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.dao.PersonDao;
import graphql.pojo.Person;

//See : baeldung.com/spring-graphql

@Component
public class PersonQuery implements GraphQLQueryResolver {

	private PersonDao personDao = PersonDao.INSTANCE;
	
	//implements :: getPerson(id:String!): Person!
	public Person getPerson(String id) {
        return personDao.gePersonById(id);
    }
	
	//allPerson() : [Person]!
	public List<Person> allPerson() {
        return personDao.getAllPerson();
    }
}
