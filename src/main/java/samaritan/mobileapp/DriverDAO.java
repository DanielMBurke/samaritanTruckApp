package samaritan.mobileapp;

import java.util.List;

public interface DriverDAO {

	public void save(Driver newDriver);						// add a new driver
	public Driver findDriverById(long id);					// find driver by id
	public List<Driver> findDriverByCity(String city);		// Finds all the drivers with the city that passed
	public List<Driver> findDriverByType(String driverType); 	// Finds all the drivers with the driver type passed
	public void update(Driver driver);						// update the driver
	public void delete(long id);								// delete driver using their id
	
}
