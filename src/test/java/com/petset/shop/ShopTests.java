package com.petset.shop;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShopTests {
	
	Shop shop = new Shop();

	@Test
	// Triple A Testing
	public void addEmployee() {
		// This is for preparing out test
		// Arrange
		String firstName = "Eli";
		String lastName = "Kali";
		
		// This is what we want to really test
		// Act
		shop.addEmployee(firstName, lastName);
		
		
		// This is how we can verify it works
		// Assert
		Employee e = shop.employees.get(0);
		
		assertEquals(e.firstName, firstName);
		assertEquals(e.lastName, lastName);
	}
	
	@Test
	public void enterCustomer() {
		fail("Not yet implemented");
	}
	
	@Test
	public void getCustomer() {
		fail("Not yet implemented");
	}
	
	@Test
	public void enterPet() {
		fail("Not yet implemented");
	}
}
