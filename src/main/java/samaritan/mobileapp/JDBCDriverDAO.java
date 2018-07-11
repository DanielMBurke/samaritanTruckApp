package samaritan.mobileapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCDriverDAO implements DriverDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JDBCDriverDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void save(Driver newDriver) {
		String sqlInsertDriver = "INSERT INTO driver(id, name, city, type) " +
							   "VALUES(?, ?, ?, ?)";
		newDriver.setId(getNextDriverId());
		jdbcTemplate.update(sqlInsertDriver, newDriver.getId(),
										  newDriver.getName(),
										  newDriver.getCity(),
										  newDriver.getDriverType());
										 	}
	
	public Driver findDriverById(long id) {
		Driver theDriver = null;
		String sqlFindDriverById = "SELECT id, name "+
							   "FROM city "+
							   "WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindDriverById, id);
		if(results.next()) {
			theDriver = mapRowToDriver(results);
		}
		return theDriver;
	}

	
	public void update(Driver Driver) {
		
	}

	public void delete(long id) {
		
	}

	private long getNextDriverId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_driver_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new driver");
		}
	}

	private Driver mapRowToDriver(SqlRowSet results) {
		Driver theDriver;
		theDriver = new Driver();
		theDriver.setId(results.getLong("id"));
		theDriver.setName(results.getString("name"));
		theDriver.setCity(results.getString("city"));
		theDriver.setType(results.getString("type"));

		return theDriver;
	}

	public List<Driver> findDriverByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Driver> findDriverByType(String driverType) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
