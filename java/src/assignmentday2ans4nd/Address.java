package assignmentday3ans4nd;

public class Address {
	int pinCode;
	String street,city;
	Address () {}
	Address ( String st , String cty , int pcode) {
		
		this.street = st;
		this.city = cty;
		this.pinCode = pcode;
	}
	public String toString() {
		return street+", "+city+" - "+pinCode;
	}

}
