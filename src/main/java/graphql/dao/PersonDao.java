package graphql.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import graphql.pojo.Person;

public enum PersonDao {
	INSTANCE;

	public Map<String,Person> personDb = new HashMap<>();
	
	//For Query
	public Person gePersonById(String personId) {
		return personDb.get(personId);
	}
	
	public List<Person> getAllPerson() {
		return new ArrayList<Person>(personDb.values());
	}

	//For Mutation
	public Person addPerson(Person p) {
		personDb.put(p.getId(), p);
		return p;
	}

}
