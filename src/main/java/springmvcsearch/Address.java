package springmvcsearch;

public class Address 
{

	private String state;
	private String city;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	
	
}
