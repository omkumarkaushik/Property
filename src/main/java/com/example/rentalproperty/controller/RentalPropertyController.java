package com.example.rentalproperty.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	public void addProperty(@RequestBody int propertyId, double expectedRent)
	{
		rpService.updateRentalProperty(propertyId, expectedRent);
	}

	@PostMapping("/deleteProperty")
	public void deleteProperty(int propertyId)
	{
		rpService.deleteRentalProperty(propertyId);
	}

	
}
