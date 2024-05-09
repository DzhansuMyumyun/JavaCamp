package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	//CRUD
	public void add(Customer customer) {
		System.out.println("Customer is added: " + customer.getFirstName());	
		Utils.runLogger(loggers, customer.getFirstName());
	}
	
	
	public void delete(Customer customer) {
		System.out.println("Customer is deleted: " + customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName());
		
	}
	
}
