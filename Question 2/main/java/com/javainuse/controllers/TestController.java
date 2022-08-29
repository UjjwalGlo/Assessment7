//write a spring application and test those application

package com.javainuse.controllers;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Customer;


@RestController

public class TestController {

 @RequestMapping(value = "/customer", method = RequestMethod.GET)

 public Customer firstPage() {

 Customer cust = new Customer();

 cust.setCust_Name("Ujjwal");

 cust.setCust_Address("Kanpur");

 cust.setCust_Id("100");

 cust.setCust_Pin(208005);

 return cust;

 }

}











