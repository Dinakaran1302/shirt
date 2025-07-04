package com.demo.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Shirt_dao;
import com.demo.entity.Shirt_entity;

@Service
public class Shirt_service {
	@Autowired
	Shirt_dao    sd;

	public String Emp(List<Shirt_entity> k) {
		return sd.find(k);
	}

	public List<Shirt_entity> value() {
		return sd.value();
	}

	public Shirt_entity max() {
		List<Shirt_entity> c=sd.value();
		Shirt_entity n=c.stream().max(Comparator.comparingInt(Shirt_entity::getPrice)).get();
		return n;
	}	

}
