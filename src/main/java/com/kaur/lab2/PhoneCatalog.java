package com.kaur.lab2;

/* Author: Jashanjot
 * COMP 303 - Enterprise App Development
 * Week 2 Lab - Constructor dependency injection using XML configuration
 */
public class PhoneCatalog {

    Products product;

    // dependency injection through constructor
    public PhoneCatalog(Products product) {
        this.product = product;
    }

    public void printMessage() {
        this.product.printMessage();
    }

}