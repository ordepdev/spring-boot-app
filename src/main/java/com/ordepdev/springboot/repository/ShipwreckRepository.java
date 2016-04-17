package com.ordepdev.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ordepdev.springboot.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
	
}