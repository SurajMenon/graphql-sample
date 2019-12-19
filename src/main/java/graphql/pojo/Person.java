package graphql.pojo;

public class Person {

	private String id;
	private String name;
	private Integer age;

	public Person(String id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// for joins .. note that this field is not in schema
	private String companyId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

}
