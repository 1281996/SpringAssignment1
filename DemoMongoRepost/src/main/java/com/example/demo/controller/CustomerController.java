package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repost.UserRepository;


//@CrossOrigin(origins = "http://localhost:7891")
@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	UserRepository repository;
	
	@PostMapping("/users/create")
	//@RequestMapping(method=RequestMethod.POST,value="/users")
	void createUser(@RequestBody User u) {
		
		boolean status=passwordVer(u);
				
				if(!status) {
				repository.save(u);
				System.out.println("inserted");
				}
				else {
					System.out.println("not inserted");
				}
				
				
				
				
		
		
	}
	
	boolean passwordVer(User u) {
		
		List<User> list1=repository.findAll();
	for(User list2:list1) {
		if(u.getPassword().equals(list2.getPassword())) {
		return true;	
		}
		
		
	}
	return false;
	}
}

//hello






