package com.mallika.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.mallika.serviceemp.ServiceEmp;

@Path("/employee")
public class Controller {
ServiceEmp service=new ServiceEmp();
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String createAccount(@FormParam("employeeId") int empId, @FormParam("employeeName") String employeeName,
			@FormParam("employeeDepartment") String employeeDepartment,
			@FormParam("employeeDesignation") String employeeDesignation,
			@FormParam("employeeSalary") double employeeSalary) {

		System.out.println("hello");

		if (service.createAccountEmployee(empId, employeeName, employeeDepartment, employeeDesignation,
				employeeSalary)) {
			System.out.println("hello");
			return "sucess";
		}
		return "notsucess";
	}

}
