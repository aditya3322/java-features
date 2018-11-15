package cloning;

import utils.Utils;

public class TestCloning implements Cloneable {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// creating common address for mother and son
		Address commonAddr = new Address(new Street("sector-78"), new City("Noida"));
		// creating mother's object and assigning common address to it
		Person mother = new Person(new Name("Hema", "Sharma"), commonAddr);
		//print mother's details
		Utils.print("Mother", mother);
		// cloning mother's object and creating clone of her 
		Person son = (Person) mother.clone();
		//assigning name to mother's child
		son.name.firstName = "Raj";
		Utils.seperator();
		// it suppose to be shallow copy using cloning
		//compare name object references.
		Utils.print("Name Objects :",Utils.compare(mother.name, son.name));
		//print mother and child object details
		Utils.print("Mother", mother);
		Utils.print("Son", son);
				
		Utils.seperator();
		
		// street of the address implements Cloneable should be deep copy
		son.address.street.streetName = "sectoc-16";
		Utils.print("Street Objects :",Utils.compare(mother.address.street, son.address.street));
		//print mother and child object details
		Utils.print("Mother", mother);
		Utils.print("Son", son);

		Utils.seperator();		
		
		// city of the address does not implements Cloneable should be shallow copy
		son.address.city.cityName = "Haridwar";
		Utils.print("City Objects :",Utils.compare(mother.address.city, son.address.city));
		//print mother and child object details
		Utils.print("Mother", mother);
		Utils.print("Son", son);

		Utils.seperator();
	}

}
