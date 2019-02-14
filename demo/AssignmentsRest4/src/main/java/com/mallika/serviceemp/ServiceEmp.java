package com.mallika.serviceemp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mallika.dao.DAOClass;

public class ServiceEmp {
      
      DAOClass dao=new DAOClass();
	public boolean createAccountEmployee(int empId, String employeeName, String employeeDepartment,
			String employeeDesignation, double employeeSalary) {
		
		return dao.createAccountEmployee(empId,employeeName,employeeDepartment,employeeDesignation,employeeSalary);
	}

}
