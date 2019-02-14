package com.mallika.firstapp.model;

public class Topic {
String name;
int price;
public Topic() {
	
}

public Topic(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
