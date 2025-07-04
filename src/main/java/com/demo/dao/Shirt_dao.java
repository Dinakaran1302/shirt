package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Shirt_entity;
import com.demo.repository.Shirt_repository;

@Repository
public class Shirt_dao {
@Autowired
Shirt_repository  sr;

public String find(List<Shirt_entity> k) {
	sr.saveAll(k);
	return "save successfully";
}

public List<Shirt_entity> value() {
	return sr.findAll();
}



}
