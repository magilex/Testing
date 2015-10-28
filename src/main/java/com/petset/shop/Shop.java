package com.petset.shop;

import java.util.List;

public class Shop {

	List<Employee> employees;
	List<Customer> customers;
	
	public void addEmployee(String firstName, String lastName) {
		Employee employee = new Employee(firstName, lastName);
		
		employees.add(employee);
	}
	
	public void enterCustomer(String firstName, String lastName) {
		Customer customer = new Customer(firstName, lastName);
		
		customers.add(customer);
	}
	
	public Customer getCustomer(String name) {
		for (Customer customer : customers) {
			if (customer.name.equals(name)) {
				return customer;
			}
		}
		
		return null;
	}
	
	public void enterPet(Customer customer, Pet pet) {
		customer.addPet(pet);
	}
}
