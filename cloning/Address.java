package cloning;


public class Address implements Cloneable {
	public Street street;
	public City city;

	public Address(Street street, City city) {
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return street + ", " + city ;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Address address = (Address) super.clone();
		address.street = (Street) address.street.clone();
		return address;
	}

}
