package cloning;

public class Street implements Cloneable {
	public String streetName;

	public Street(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return streetName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
