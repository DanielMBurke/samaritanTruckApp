package samaritan.mobileapp;

public class Driver {
	private Long id;
	private String name;
	private String driverType;
	private String city;
	private String rating; // set as an array list for rating

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
}
