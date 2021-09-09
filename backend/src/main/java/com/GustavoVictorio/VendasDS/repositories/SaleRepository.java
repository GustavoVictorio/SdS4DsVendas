package com.GustavoVictorio.VendasDS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GustavoVictorio.VendasDS.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
