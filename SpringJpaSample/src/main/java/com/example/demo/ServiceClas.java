package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClas {
	@Autowired
	TopicRepository topicRepository;
	public void addTopic(Model topic) {
		
		topicRepository.save(topic);
	}
	public List<Model> getAlltopics() {
		// TODO Auto-generated method stub
		List<Model> models=new ArrayList<>();
		topicRepository.findAll().forEach(models::add);
		return models;
	}

}
