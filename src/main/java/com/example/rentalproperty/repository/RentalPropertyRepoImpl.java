package com.example.rentalproperty.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.rentalproperty.exception.PropertyNotFoundException;
import com.example.rentalproperty.model.RentalPropertyModel;


@Repository
public class RentalPropertyRepoImpl implements IRentalPropertyRepository {
	
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addRentalProperty(RentalPropertyModel rentalProperty) {
		String insertQuery = "insert into rentalProperty values(?,?,?,?,?,?,?,?,?)";
		Object[] property = {rentalProperty.getPropertyId(),rentalProperty.getName(),rentalProperty.getType(),
				rentalProperty.getBedrooms(),rentalProperty.getArea(),rentalProperty.getLocation(),rentalProperty.getCity(),
				rentalProperty.getRentalExpected(),rentalProperty.getSecurityDeposit()};
		jdbcTemplate.update(insertQuery, property);
	}

	@Override
	public void updateRentalProperty(int propertyId, double expectedRent) {
		String updatetQuery = "update rentalProperty set rentalExpected = ? where propertyId = ?";
		Object[] property = {expectedRent,propertyId};
		jdbcTemplate.update(updatetQuery, property);
		
		//jdbcTemplate.update(updatetQuery, expectedRent, propertyId);
		
	}

	@Override
	public void deleteRentalProperty(int propertyId) {
		String deleteQuery = "delete from rentalProperty where propertyId = ?";
		Object[] property = {propertyId};
		jdbcTemplate.update(deleteQuery, property);
		
	}

	@Override
	public RentalPropertyModel findById(int propertyId) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> findByCategory(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> findByType(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> findByRentRange(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> findByLesserDeposit(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> findByCity(String city) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> findByLocation(String location) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> showAll() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String query = "Select * from rentalProperty";
		List<RentalPropertyModel> lst = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(RentalPropertyModel.class));
		return lst;
	}

}
