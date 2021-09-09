package com.GustavoVictorio.VendasDS.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.GustavoVictorio.VendasDS.dto.SellerDTO;
import com.GustavoVictorio.VendasDS.entities.Seller;
import com.GustavoVictorio.VendasDS.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;

	@Transactional(readOnly = true)
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}

}
