package com.ordepdev.springboot.model;

import javax.persistence.*;

@Entity
public class Shipwreck {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String description;
	private String condition;
	private int depth;
	private double latitude;
	private double longitude;
	private int yearDiscovered;
	
	public Shipwreck() {}
	
	public Shipwreck(long id, String name, String description, String condition, int depth, double latitude, double longitude, int yearDiscovered) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.condition = condition;
		this.depth = depth;
		this.latitude = latitude;
		this.longitude = longitude;
		this.yearDiscovered = yearDiscovered;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCondition() {
		return condition;
	}

	public Integer getDepth() {
		return depth;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public Integer getYearDiscovered() {
		return yearDiscovered;
	}	
}
