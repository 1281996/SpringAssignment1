package com.mallika.dao;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import com.mallika.model.Model;
@Component
public class DAOClass {
	private static final String PERSON_COLLECTION = "Model";
	
	private MongoOperations mongoOperations;
	public DAOClass(MongoOperations mongoOperations){
		this.mongoOperations=mongoOperations;
	}
	
	public void create(Model p) {
		this.mongoOperations.insert(p, PERSON_COLLECTION);
	}
}
