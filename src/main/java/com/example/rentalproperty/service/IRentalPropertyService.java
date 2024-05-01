package com.example.rentalproperty.service;

import java.util.List;

import com.example.rentalproperty.exception.PropertyNotFoundException;
import com.example.rentalproperty.model.RentalPropertyModel;

public interface IRentalPropertyService {

	void addRentalProperty(RentalPropertyModel rentalProperty);
	void updateRentalProperty(Integer propertyId, double expectedRent);
	void deleteRentalProperty(Integer propertyId);
	List<RentalPropertyModel> getById(int propertyId) throws PropertyNotFoundException;
	
	List<RentalPropertyModel> getAllProperty() throws PropertyNotFoundException;
	List<RentalPropertyModel> getByCategory(String category) throws PropertyNotFoundException;
	List<RentalPropertyModel> getByType(String category) throws PropertyNotFoundException;
	List<RentalPropertyModel> getByRentRange(String category) throws PropertyNotFoundException;
	List<RentalPropertyModel> getByLesserDeposit(String category) throws PropertyNotFoundException;
	
	List<RentalPropertyModel> getByCity(String city) throws PropertyNotFoundException;
	List<RentalPropertyModel> getByLocation(String location) throws PropertyNotFoundException;
	List<RentalPropertyModel> getByRentRange() throws PropertyNotFoundException;
	List<RentalPropertyModel> getByRentRange(String lowerRange, String higherRange) throws PropertyNotFoundException;
	
}
