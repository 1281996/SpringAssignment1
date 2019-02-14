package com.mallika.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mallika.dao.DAOClass;
import com.mallika.model.Model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
    DAOClass daoClass=applicationContext.getBean(DAOClass.class);
    Model model=new Model(102,"mallika",99125978);
    daoClass.create(model);
	}

}
