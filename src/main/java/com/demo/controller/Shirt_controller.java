package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.entity.Shirt_entity;
import com.demo.service.Shirt_service;

@RestController
@RequestMapping(value="/one")
public class Shirt_controller {
	@Autowired
	Shirt_service   ss;
     @PostMapping(value="/post")
	public String Emp(@RequestBody List<Shirt_entity> k ) {
		return ss.Emp(k);
}
     @GetMapping ("/get")
     public List<Shirt_entity> value(){
    	 return ss.value();
     }
     @GetMapping ("/max")
     public Shirt_entity maximum (){
    	 return ss.max();
     }
     @GetMapping ("/gtr")
     public String get() {
    	 return "saved";
     }
     @GetMapping ("/new")
     public String find() {
    	 return "finished";
     }
}