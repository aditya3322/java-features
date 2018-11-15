package cloning;

public class Person implements Cloneable {
	public Name name;
	public Address address;

	public Person(Name name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + name + ", Address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		person.address = (Address) person.address.clone();
		return person;
	}
}
