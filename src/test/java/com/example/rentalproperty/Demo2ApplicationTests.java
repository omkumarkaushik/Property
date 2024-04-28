package com.example.rentalproperty;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.rentalproperty.model.RentalPropertyModel;
import com.example.rentalproperty.repository.IRentalPropertyRepository;
import com.example.rentalproperty.service.IRentalPropertyService;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo2ApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private IRentalPropertyService service;
	
	@MockBean
	private IRentalPropertyRepository repository;
	
	@Test
	public void getAllProperty() {
		when(repository.showAll()).thenReturn(Stream.
				of(new RentalPropertyModel(1,"Ray-ban","resden","3BHK","Marathalli"
						,"Benagaluru urban","Bengalore",2000.0,105.0)).collect(Collectors.toList()));
		assertEquals(1, service.getAllProperty().size());
	}
	
	@Test
	public void getPropertyById() {
		when(repository.findById(1)).thenReturn(Stream.
				of(new RentalPropertyModel(1,"Ray-ban","resden","3BHK","Marathalli"
						,"Benagaluru urban","Bengalore",2000.0,105.0)).collect(Collectors.toList()));
		assertEquals(1, service.getById(1).size());
	}
	
//	@Test
//	public void addPropertyTest() {
//		RentalPropertyModel rpModel = new RentalPropertyModel(1,"Ray-ban","resden","3BHK","Marathalli"
//						,"Benagaluru urban","Bengalore",2000.0,105.0);
//		when(repository.addRentalProperty(rpModel)).thenReturn(rpModel);
//		assertEquals(rpModel,service.addRentalProperty(rpModel));
//	}

}
