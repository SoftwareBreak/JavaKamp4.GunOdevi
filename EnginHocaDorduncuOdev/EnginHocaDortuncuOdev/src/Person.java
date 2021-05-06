
public class Person implements IEntity{
private int id;
private String name;
private String tc;
private String DateOfBirth;

public Person() {
	
}

public Person(int id, String name, String tc, String dateOfBirth) {
	super();
	this.id = id;
	this.name = name;
	this.tc = tc;
	DateOfBirth = dateOfBirth;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTc() {
	return tc;
}

public void setTc(String tc) {
	this.tc = tc;
}

public String getDateOfBirth() {
	return DateOfBirth;
}

public void setDateOfBirth(String dateOfBirth) {
	DateOfBirth = dateOfBirth;
}


}
