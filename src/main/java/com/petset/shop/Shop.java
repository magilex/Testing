package com.petset.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.in;

public class Shop {

	List<Employee> employees = new ArrayList<>();;
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
	
	
	static List<Character> options = Arrays.asList('1');
	
	public static void main(String [] args) {
		out.println("Welcome to the greatest Pet Shop in town.");
		out.println("Please select any of the following options:");
		out.println("1) Add employee");
		out.println("2) Add customer");
		out.println("3) Find employee");
		out.println("4) Find customer");
		
		
		try {
			while (!scanInput()) { }
		} catch (InputMismatchException e) {
			out.print("Please choose a valid option");
		}	
		
	}
	
	private static boolean scanInput() {
		try (Scanner sc = new Scanner(in)) {
			if (sc.hasNextLine()) {
				
				Character input = (char) sc.nextShort();
				out.println("input" + input);
				if (options.stream().anyMatch(option -> option.equals(input))) {
					out.printf("Option %s chosen \n", input);
					return true;
				} else {
					out.print("Please choose a valid option .");
					return false;
				}

			}
		}
		return false;
	}
	
}
