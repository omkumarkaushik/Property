package com.example.rentalproperty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentalproperty.model.RentalPropertyModel;
import com.example.rentalproperty.service.IRentalPropertyService;

@RestController
public class RentalPropertyController {

	
	private IRentalPropertyService rpService;
	
	@Autowired
	public void setRpService(IRentalPropertyService rpService) {
		this.rpService = rpService;
	}
	
	@PutMapping("/AddProperty")
	public void addProperty(@RequestBody RentalPropertyModel rentalProperty)
	{
		rpService.addRentalProperty(rentalProperty);
	}

	@PostMapping("/updateProperty")
	public void addProperty(@RequestBody Integer propertyId, double expectedRent)
	{
		rpService.updateRentalProperty(propertyId, expectedRent);
	}

	@PostMapping("/deleteProperty")
	public void deleteProperty(@RequestBody Integer propertyId)
	{
		rpService.deleteRentalProperty(propertyId);
	}

	@GetMapping("/allProperty")
	public List<RentalPropertyModel> getAllProperty() {
		return rpService.getAllProperty();
	}
	
	@GetMapping("/cityProp")
	public List<RentalPropertyModel> getAllPropertyByCategory(@RequestBody String city) {
		return rpService.getByCity(city);
	}
	
	@GetMapping("/getById")
	public List<RentalPropertyModel> getAllPropertyById(@RequestBody Integer id) {
		return rpService.getById(id);
	}
	
	@GetMapping("/getAllRange")
	public List<RentalPropertyModel> getAllRentRange() {
		return rpService.getByRentRange();
	}
	
	@GetMapping("/getAllCategory")
	public List<RentalPropertyModel> getAllCategory(@RequestBody String category) {
		return rpService.getByCategory(category);
	}
	
	@GetMapping("/getAllType")
	public List<RentalPropertyModel> getAllType(@RequestBody String type) {
		return rpService.getByType(type);
	}
	
	@GetMapping("/getAllRentRange")
	public List<RentalPropertyModel> getAllRange(@RequestBody String lowerRange, String higherRange) {
		return rpService.getByRentRange(lowerRange, higherRange);
	}
}
