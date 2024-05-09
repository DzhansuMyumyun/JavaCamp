package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer dzhansu = new IndividualCustomer();
		dzhansu.customerNumber = "123";
		
		CorporateCustomer bank = new CorporateCustomer(); 
		bank.customerNumber = "7658";
		
		UnionCustomer unioncustomer = new UnionCustomer();
		unioncustomer.customerNumber = "987";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(bank);
		customerManager.add(dzhansu);
		customerManager.add(unioncustomer); 
		
		Customer[] customers = {dzhansu, bank, unioncustomer};	
		customerManager.addMultiple(customers);
		
		

	}

}
