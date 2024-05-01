package com.example.rentalproperty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rentalproperty.exception.PropertyNotFoundException;
import com.example.rentalproperty.model.RentalPropertyModel;
import com.example.rentalproperty.repository.IRentalPropertyRepository;


@Service
public class RentalPropertyServiceImpl implements IRentalPropertyService {

	private IRentalPropertyRepository rentalPropertyRepo;
	
	
	@Autowired
	public void setRentalPropertyRepo(IRentalPropertyRepository rentalPropertyRepo) {
		this.rentalPropertyRepo = rentalPropertyRepo;
	}

	@Override
	public void addRentalProperty(RentalPropertyModel rentalProperty) {
		rentalPropertyRepo.addRentalProperty(rentalProperty);
		
	}

	@Override
	public void updateRentalProperty(Integer propertyId, double expectedRent) {
		rentalPropertyRepo.updateRentalProperty(propertyId, expectedRent);
		
	}

	@Override
	public void deleteRentalProperty(Integer propertyId) {
		rentalPropertyRepo.deleteRentalProperty(propertyId);
		
	}

	@Override
	public List<RentalPropertyModel> getById(int propertyId) throws PropertyNotFoundException {
		return rentalPropertyRepo.findById(propertyId);
	}

	@Override
	public List<RentalPropertyModel> getByCategory(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return rentalPropertyRepo.findByCategory(category);
	}

	@Override
	public List<RentalPropertyModel> getByType(String type) throws PropertyNotFoundException {
		return rentalPropertyRepo.findByType(type);
	}

	@Override
	public List<RentalPropertyModel> getByRentRange() throws PropertyNotFoundException {
		return rentalPropertyRepo.findByRentRange();
	}

	@Override
	public List<RentalPropertyModel> getByLesserDeposit(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getByCity(String city) throws PropertyNotFoundException {
		return rentalPropertyRepo.findByCity(city);
	}

	@Override
	public List<RentalPropertyModel> getByLocation(String location) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getAllProperty() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return rentalPropertyRepo.showAll();
		
	}

	@Override
	public List<RentalPropertyModel> getByRentRange(String lowerRange, String higherRange) throws PropertyNotFoundException {
		return rentalPropertyRepo.findByRentRange(lowerRange, higherRange);
	}

	@Override
	public List<RentalPropertyModel> getByRentRange(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
