package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_15 {
	
public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter our Income:");
	int income = input.nextInt();
	
	if(income<=2.50000){
		System.out.println("No tax ");
	}else if(income<500000){
		System.out.println(" tax is 5%");
	}else if(income<1000000){
		System.out.println(" tax is 20%");
	}else {
		System.out.println(" tax is 30%");
	}
}

}

//input income
	// tax 	
			// <2.5L : No tax
			// 2.5L-5L:5%
	  		// 5L-10L:20%
	  		// 10L:30%			
