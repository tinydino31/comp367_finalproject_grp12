package com.kaur.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/* Author: Jashanjot
 * COMP 303 - Enterprise App Development
 * Week 2 Lab - Constructor dependency injection using XML configuration
 */

public class PhoneTest {
	
	//Bug Fix: Corrected constructor argument type mapping
    //Changed type from 'String' to correct expected type

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        PhoneCatalog phoneCatalog = context.getBean("phoneCatalog", PhoneCatalog.class);

        phoneCatalog.printMessage();
    }

}
