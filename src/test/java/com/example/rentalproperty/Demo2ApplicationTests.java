package com.example.rentalproperty;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
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
	
	/*
	 * Isse mockbean banate hai to avoid hitting db again and again
	 */
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
	
	/*
	 * Void method ke liye Verify use hota hai to check if 
	 * repository is hit at least one/more time.
	 */
	@Test
	public void addPropertyTest() {
		RentalPropertyModel rpModel = new RentalPropertyModel(1,"Ray-ban","resden","3BHK","Marathalli"
						,"Benagaluru urban","Bengalore",2000.0,105.0);
//		when(repository.addRentalProperty(rpModel)).thenReturn(rpModel);
//		assertEquals(rpModel,service.addRentalProperty(rpModel));
		service.addRentalProperty(rpModel);
		verify(repository, times(1)).addRentalProperty(rpModel);
	}
	
	@Test
	public void deletePropertyTest() {
		Integer id = 21;
		service.deleteRentalProperty(id);
		verify(repository,times(1)).deleteRentalProperty(id);
	}
	
	@Test
	public void getByCityTest() {
		when(repository.findByCity("Delhi")).thenReturn(Stream.
				of(new RentalPropertyModel(1,"Ray-ban","resden","3BHK","Marathalli"
						,"Benagaluru urban","Delhi",2000.0,105.0),
						new RentalPropertyModel(2,"Ray-ban","resden","3BHK","Marathalli"
								,"Benagaluru urban","Delhi",2000.0,105.0),
						new RentalPropertyModel(1,"Ray-ban","resden","3BHK","Marathalli"
								,"Benagaluru urban","Delhi",2000.0,105.0)).collect(Collectors.toList()));
		assertEquals(3, service.getByCity("Delhi").size());
	}

}
