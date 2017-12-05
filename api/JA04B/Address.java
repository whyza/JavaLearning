package JA04B;

public class Address {
	private String name;
	private String street;
	private String city;
	private String country;
	private int pinCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "["+"\n"+"name=" + name + "\n"+"street=" + street+"\n" + "city=" + city + "country=" + country + "pinCode="
				+ pinCode + "\n,\n]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String name, String street, String city, String country, int pinCode) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}
	
}
