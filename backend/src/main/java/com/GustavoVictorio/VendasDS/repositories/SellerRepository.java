package com.GustavoVictorio.VendasDS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GustavoVictorio.VendasDS.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
