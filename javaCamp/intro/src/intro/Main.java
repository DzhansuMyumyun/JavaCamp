package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		//Basic variables
		String doSomethingButton = "Internet Filiaal";
		double dollarYesterday = 8.15; 
		double dollarToday = 8.10;
		int maturity = 36;
		boolean didItFall = false;
		
		System.out.println(doSomethingButton);
		
		if(dollarToday < dollarYesterday) {
			System.out.println("Dollar fell");
		}else if(dollarToday > dollarYesterday){
			System.out.println("Dollar rose");
		}
		else {
			System.out.println("Dollar equal");
		}
		
		
		
		//Array
		String loan1 = "Fast loan";
		String loan2 = "Farmer loan";
		String loan3 = "Housing loan";
		
		String[] loans = {loan1, loan2, loan3};
		
		for (String loan : loans) {
			System.out.println(loan);
		}
		
		for (int i = 0; i < loans.length; i++) {
			System.out.println(loans[i]); 
		}
		
		
		//ref type
		int number1 = 10;
		int number2 = 20;
		number1 = number2;
		number2 = 100;
		System.out.println(number1);

		
		int[] numbers1 = {1,2,3,4};
		int[] numbers2 = {10,20,30,40};
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]);
	}

}
