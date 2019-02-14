package com.mallika.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.mallika.dao.DAOClass;
import com.mallika.model.Model;
@Component
public class Service {
	@Autowired
	DAOClass daoClass;
	
	 public Model registration(int id,String name,int phone) {
		 daoClass.create(new Model(id,name,phone));
		return new Model(id,name,phone);
	 }
}
