package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controler {
	@Autowired
	ServiceClas serviceClas;
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Model topic) {
		System.out.println(topic.getName());
		serviceClas.addTopic(topic);
		
	}
	@RequestMapping("/topics")
	public List<Model> getAlltopics(){
		return serviceClas.getAlltopics();
		
	}
}
