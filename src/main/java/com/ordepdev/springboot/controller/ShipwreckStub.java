package com.ordepdev.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ordepdev.springboot.model.Shipwreck;

public class ShipwreckStub {

	private static Map<Long, Shipwreck> wrecks = new HashMap<>();
	
	static {
		Shipwreck ship1 = new Shipwreck(1L, "U869", "Description", "Condition", 200, 40, 20, 2000);
		Shipwreck ship2 = new Shipwreck(2L, "U819", "Description", "Condition", 200, 40, 20, 2000);
		Shipwreck ship3 = new Shipwreck(3L, "U847", "Description", "Condition", 200, 40, 20, 2000);
		
		wrecks.put(ship1.getId(), ship1);
		wrecks.put(ship2.getId(), ship2);
		wrecks.put(ship3.getId(), ship3);
	}
	
	public static List<Shipwreck> all() {
		return new ArrayList<Shipwreck>(wrecks.values());
	}

	public static Shipwreck create(Shipwreck shipwreck) {
		wrecks.put(shipwreck.getId(), shipwreck);
		return shipwreck;
	}

	public static Shipwreck get(long id) {
		return wrecks.get(id);
	}

	public static Shipwreck update(long id, Shipwreck shipwreck) {
		wrecks.replace(id, shipwreck);
		return shipwreck;
	}

	public static Shipwreck delete(long id) {
		Shipwreck shipwreck = wrecks.get(id);
		wrecks.remove(id);
		return shipwreck;
	}
}
