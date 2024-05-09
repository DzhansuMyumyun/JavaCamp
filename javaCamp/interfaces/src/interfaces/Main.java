package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Dzhansu", "Halim");
		Logger[] loggers = {new EmailLogger(), new FileLogger()};  
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		customerManager.add(customer1);
		

	}

}
