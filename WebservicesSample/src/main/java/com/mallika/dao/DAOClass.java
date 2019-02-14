package com.mallika.dao;

import java.util.ArrayList;
import java.util.List;

import com.mallika.pojo.Employee;

public class DAOClass {
public List<Employee> getALLDetails(){
	
	List<Employee> employees=new ArrayList<>();
	employees.add(new Employee(101,"mallika"));
	
	return employees;
	
}
	
	
}
