
public class PersonFakeCheckManager implements IPersonCheckService{

	@Override
	public boolean checkIfRealPerson(Person person) {
		if(person.getTc()=="430") {
			return true;
			
		}
		else {
			return false;
		}
	}

	
}
