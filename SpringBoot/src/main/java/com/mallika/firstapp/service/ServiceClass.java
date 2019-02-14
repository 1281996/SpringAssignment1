package com.mallika.firstapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ServiceClass {
List<com.mallika.firstapp.model.Topic> topics=new ArrayList<>(Arrays.asList(new com.mallika.firstapp.model.Topic("mallika",90),new com.mallika.firstapp.model.Topic("prasad",60)));
   public List<com.mallika.firstapp.model.Topic> getAllTopics(){
	   return topics;
   }
   
   public com.mallika.firstapp.model.Topic getOneRecord(int price){
	   return topics.stream().filter(t->t.getPrice()==price).findFirst().get();
   }


public void addTopic(com.mallika.firstapp.model.Topic topic) {
	topics.add(topic);
	
}

public void deleteTopic(int price) {
	topics.removeIf(t->t.getPrice()==price);
	
}



/*public void update(int price) {
    for(int i=0;i<topics.size();i++) {
  	  if(price==top)
    }
	
	
}*/
   
}
