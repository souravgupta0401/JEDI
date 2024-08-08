package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;

/**
 * @author Dell
 *
 */
// Client layer which is call all the business methods in Customer Application
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerBusiness business=new CustomerBusiness();
	    business.createCustomer();
		System.out.println("delete customer by Id--." +business.deleteCustomer(101));
		System.out.println("Update Customer by id-->" +business.updateCustomer(101));
		business.listCustomer();
		

	}

}