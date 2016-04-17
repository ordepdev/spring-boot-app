package com.ordepdev.springboot;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ordepdev.springboot.model.Shipwreck;
import com.ordepdev.springboot.repository.ShipwreckRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegrationTest {
	
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	@Test
	public void find_all_should_return_results() {
		List<Shipwreck> shipwrecks = shipwreckRepository.findAll();
		
		assertThat(shipwrecks.size(), is(greaterThan(0)));
	}
}
