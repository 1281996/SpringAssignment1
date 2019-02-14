package com.mallika.main;

import java.net.UnknownHostException;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mallika.model.Person;
import com.mongodb.MongoClient;

public class Main {

	
		public static final String DB_NAME = "samplejavamongo";
		public static final String PERSON_COLLECTION = "Person1";
		public static final String MONGO_HOST = "localhost";
		public static final int MONGO_PORT = 27017;

		public static void main(String[] args) {
			try {
				MongoClient mongo = new MongoClient(
						MONGO_HOST, MONGO_PORT);
				MongoOperations mongoOps = new MongoTemplate(mongo, DB_NAME);
				Person p = new com.mallika.model.Person("115", "PankajKr", "Bangalore, India");
				mongoOps.insert(p, PERSON_COLLECTION);

				Person p1 = mongoOps.findOne(
						new Query(Criteria.where("name").is("PankajKr")),
						Person.class, PERSON_COLLECTION);

				System.err.println(p1);
				
				//mongoOps.dropCollection(PERSON_COLLECTION);
				mongo.close();
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
		}

	}


