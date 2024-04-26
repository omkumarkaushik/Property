package com.example.rentalproperty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "RentalProperty")
public class RentalPropertyModel {

	public Integer propertyId;
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public String name;
	public String type;
	public String bedrooms;
	public String area;
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getRentalExpected() {
		return rentalExpected;
	}
	public void setRentalExpected(double rentalExpected) {
		this.rentalExpected = rentalExpected;
	}
	public double getSecurityDeposit() {
		return securityDeposit;
	}
	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}
	public String location;
	public String city;
	public Double rentalExpected;
	public Double securityDeposit;
	public void setRentalExpected(Double rentalExpected) {
		this.rentalExpected = rentalExpected;
	}
	public void setSecurityDeposit(Double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}	
	
}
