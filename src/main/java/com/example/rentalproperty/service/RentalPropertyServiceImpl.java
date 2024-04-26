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
	public void deleteRentalProperty(int propertyId) {
		rentalPropertyRepo.deleteRentalProperty(propertyId);
		
	}

	@Override
	public RentalPropertyModel getById(int propertyId) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getByCategory(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getByType(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getByRentRange(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getByLesserDeposit(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalPropertyModel> getByCity(String city) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
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

}
