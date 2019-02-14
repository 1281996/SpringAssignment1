package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.User1;
import com.example.demo.service.Service;

@RestController
public class Controller {
	@Autowired
	Service service;
	@RequestMapping(method=RequestMethod.POST,value="/api/users/create")
void createUser(User1 u) {
		service.createUser(u);
		
	}
}
