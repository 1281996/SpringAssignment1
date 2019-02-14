package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
@Id
String name;
String password;
boolean active;




public boolean isActive() {
	return active;
}


public void setActive(boolean active) {
	this.active = active;
}

public User() {
	
}


public User(String name, String password) {
	
	this.name = name;
	this.password = password;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "User [name=" + name + ", password=" + password + ", active=" + active + ", isActive()=" + isActive()
			+ ", getName()=" + getName() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
