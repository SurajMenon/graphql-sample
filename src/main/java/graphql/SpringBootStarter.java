package graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import graphql.dao.CompanyDao;
import graphql.dao.PersonDao;
import graphql.pojo.Company;
import graphql.pojo.Person;

@SpringBootApplication
public class SpringBootStarter extends SpringBootServletInitializer {

    public static void main(String[] args) {
    	
    	//Initializing DB
    	CompanyDao.INSTANCE.companyDb.put("1", new Company("1", "Apple"));
    	CompanyDao.INSTANCE.companyDb.put("2", new Company("2", "Amazon"));
    	
    	PersonDao.INSTANCE.personDb.put("1",new Person("1","Ram",20,"1"));
    	PersonDao.INSTANCE.personDb.put("2",new Person("2","Rahim",22,"1"));
    	
    	
        SpringApplication.run(SpringBootStarter.class, args);
    }
}