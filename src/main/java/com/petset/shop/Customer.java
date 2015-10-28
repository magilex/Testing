package com.petset.shop;

public class Customer {
	String name;
	String address;
	Pet pet;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void addPet(Pet pet) {
		this.pet = pet;
	}

}
