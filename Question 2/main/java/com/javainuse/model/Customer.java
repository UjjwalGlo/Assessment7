package com.javainuse.model;



public class Customer {

 private String cust_Id;

 @Override
public String toString() {
	return "Customer [cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", cust_Address=" + cust_Address
			+ ", cust_Pin=" + cust_Pin + "]";
}

public String getCust_Id() {
	return cust_Id;
}

public void setCust_Id(String cust_Id) {
	this.cust_Id = cust_Id;
}

public String getCust_Name() {
	return cust_Name;
}

public void setCust_Name(String cust_Name) {
	this.cust_Name = cust_Name;
}

public String getCust_Address() {
	return cust_Address;
}

public void setCust_Address(String cust_Address) {
	this.cust_Address = cust_Address;
}

public double getCust_Pin() {
	return cust_Pin;
}

public void setCust_Pin(double cust_Pin) {
	this.cust_Pin = cust_Pin;
}

private String cust_Name;

 private String cust_Address;

 private double cust_Pin;

}