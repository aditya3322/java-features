package cloning;

public class Name {
	public String firstName;
	public String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return  firstName + " " + lastName;
	}

}