package com.mallika.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mallika.dao.DAOClass;
import com.mallika.pojo.Employee;
@Path("/myresources")
public class Resource {
	
	DAOClass dao=new DAOClass();
@GET
 @Produces(MediaType.APPLICATION_XML)
	public List<Employee> getDetails()
	{

		
		return dao.getALLDetails();
		
	}
}
