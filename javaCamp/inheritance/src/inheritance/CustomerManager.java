package inheritance;

import java.util.Iterator;

public class CustomerManager {
	
	//SOLID- Open Closed Principle
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " saved. ");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
	
}
