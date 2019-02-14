package com.mallika.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mallika.pojo.Employee;

public class DAOClass {
	List<Employee> emp=new ArrayList<>();

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public boolean createAccountEmployee(int empId, String employeeName, String employeeDepartment,
			String employeeDesignation, double employeeSalary) {

		emp.add(new Employee(empId, employeeName, employeeDepartment, employeeDesignation, employeeSalary));

		/*setEmp(emp);
       System.out.println(getEmp());
       */
       
		return true;
	}

}
