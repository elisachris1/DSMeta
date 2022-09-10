package com.elisarovani.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elisarovani.dsmeta.entities.Sale;
import com.elisarovani.dsmeta.repositories.SaleRespository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRespository repository;
	
	public List <Sale> findSales() {
		return repository.findAll();
		
		
	}

}
