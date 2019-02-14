package com.mallika.model;

public class Model {
	int empId;
	String name;
	int phoneNumber;
	public Model(){
		
	}
	
	public Model(int empId, String name, int phoneNumber) {
		super();
		this.empId = empId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Model [empId=" + empId + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
