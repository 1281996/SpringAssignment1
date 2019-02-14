package com.mallika.firstapp.listcontroller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mallika.firstapp.model.Topic;
import com.mallika.firstapp.service.ServiceClass;
@RestController
public class ListController {
	@Autowired
	ServiceClass serviceClass;
	@RequestMapping("/topics")
	public List<Topic> listValues(){
		return serviceClass.getAllTopics();
		
				
		
	}
	@RequestMapping("/topics/{price}")
	public Topic getOneRecord(@PathVariable int price){
		
		return serviceClass.getOneRecord(price);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		System.out.println(topic.getName());
		serviceClass.addTopic(topic);
		
	}
	/*@RequestMapping(method=RequestMethod.DELETE,value="/topics/{price}")
	public void update(int price) {
		serviceClass.update(price);
		
	}
	*/

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{price}")
   public void deleteTopic(@PathVariable int price) {
		
		serviceClass.deleteTopic(price);
	}
}
