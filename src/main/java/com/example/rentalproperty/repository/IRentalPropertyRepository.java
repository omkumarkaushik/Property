package com.example.rentalproperty.repository;

import java.util.List;

import com.example.rentalproperty.exception.PropertyNotFoundException;
import com.example.rentalproperty.model.RentalPropertyModel;

public interface IRentalPropertyRepository {

	void addRentalProperty(RentalPropertyModel rentalProperty);
	void updateRentalProperty(int propertyId, double expectedRent);
	void deleteRentalProperty(Integer propertyId);
	List<RentalPropertyModel> findById(int propertyId) throws PropertyNotFoundException;
	
	List<RentalPropertyModel> showAll() throws PropertyNotFoundException;
	List<RentalPropertyModel> findByCategory(String category) throws PropertyNotFoundException;
	List<RentalPropertyModel> findByType(String category) throws PropertyNotFoundException;
	List<RentalPropertyModel> findByRentRange(String category) throws PropertyNotFoundException;
	List<RentalPropertyModel> findByLesserDeposit(String category) throws PropertyNotFoundException;
	
	List<RentalPropertyModel> findByCity(String city) throws PropertyNotFoundException;
	List<RentalPropertyModel> findByLocation(String location) throws PropertyNotFoundException;
	List<RentalPropertyModel> findByRentRange() throws PropertyNotFoundException;
	List<RentalPropertyModel> findByRentRange(String lowerRange, String higherRange) throws PropertyNotFoundException;
	
}
