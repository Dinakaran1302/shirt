package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Shirt_entity;

public interface Shirt_repository extends JpaRepository<Shirt_entity,Integer> {

	

}
