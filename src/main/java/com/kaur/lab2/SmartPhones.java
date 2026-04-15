package com.kaur.lab2;

/* Author: Jashanjot
 * COMP 303 - Enterprise App Development
 * Week 2 Lab - Constructor dependency injection using XML configuration
 */
public class SmartPhones implements Products {
	// Service layer bean implementation
	// Configured via Spring XML for loose coupling
    @Override
    public void printMessage() {
        System.out.println("I am a Smart Phone");
    }

}
