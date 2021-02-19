public class Student {
	
	String studentID, name, address, town, state;

	public Student(String studentID, String name, String address, String town, String state) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.address = address;
		this.town = town;
		this.state = state;
	}
	
	public Student() {
		this("<ID>","Name","<Address>","<Town>","<State>");	
	}

	@Override
	public String toString() {
		return String.format("#%s, %s resides at %s, %s, %s", studentID, name, address,
				town, state);
	}
		
}