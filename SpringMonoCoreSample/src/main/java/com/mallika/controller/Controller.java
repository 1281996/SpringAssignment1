package com.mallika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mallika.model.Model;
import com.mallika.service.Service;
@RestController
public class Controller {
	@Autowired
	Service service;
	
	@RequestMapping("/create")
	String register(@RequestParam int id,@RequestParam String name,@RequestParam int phone){
		System.out.println("hello");
		Model m=service.registration(id,name,phone);
		return service.toString();
	}
	
}
