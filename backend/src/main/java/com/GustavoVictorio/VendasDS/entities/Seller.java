package com.GustavoVictorio.VendasDS.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Seller implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;

	private List<Sale> sales = new ArrayList<>();

	public Seller() {

	}

	public Seller(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}

}
