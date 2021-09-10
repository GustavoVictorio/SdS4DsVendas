package com.GustavoVictorio.VendasDS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.GustavoVictorio.VendasDS.dto.SaleDTO;
import com.GustavoVictorio.VendasDS.dto.SaleSuccessDTO;
import com.GustavoVictorio.VendasDS.dto.SaleSumDTO;
import com.GustavoVictorio.VendasDS.entities.Sale;
import com.GustavoVictorio.VendasDS.repositories.SaleRepository;
import com.GustavoVictorio.VendasDS.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}

}
