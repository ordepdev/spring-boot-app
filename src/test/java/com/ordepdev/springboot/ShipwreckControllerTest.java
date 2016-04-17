package com.ordepdev.springboot;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.ordepdev.springboot.controller.ShipwreckController;
import com.ordepdev.springboot.model.Shipwreck;
import com.ordepdev.springboot.repository.ShipwreckRepository;

public class ShipwreckControllerTest {

	@InjectMocks
	private ShipwreckController controller;
	
	@Mock
	private ShipwreckRepository repository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void first_shipwreck_id_should_be_one() {
		Shipwreck mock =  new Shipwreck(1L, "U869", "Description", "Condition", 200, 40, 20, 2000);
		when(repository.findOne(1L)).thenReturn(mock);
		
		Shipwreck shipwreck = controller.get(1);
		
		verify(repository).findOne(1L);
		
		//assertEquals(1L, shipwreck.getId().longValue());
		assertThat(shipwreck.getId(), is(1L));
	}
}
