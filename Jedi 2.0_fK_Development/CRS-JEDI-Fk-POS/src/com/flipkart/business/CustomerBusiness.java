package com.flipkart.business;

/**
 * @author Dell
 *
 */
public class CustomerBusiness {

	// define the business Methods

	// create Customer
	public void createCustomer() {

		System.out.println("Customer is created here--->");
	}

	public boolean deleteCustomer(int customerId) {

		System.out.println("customer is deleted with Id-->" + customerId);
		return true;
	}

	public boolean updateCustomer(int customerId) {

		System.out.println("Customer is updated with id-->" + customerId);
		return true;
	}
	
	public void listCustomer() {

		System.out.println(" detsils of customer -->");
	}

}