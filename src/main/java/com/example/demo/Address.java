package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String addressLine1;
	private String City;
	private int zipCode;
	
	public Address() {}
	public Address(String addressLine1, String city, int zipCode) {
		this.addressLine1 = addressLine1;
		City = city;
		this.zipCode = zipCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	
}
