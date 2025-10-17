package If_Else_3_1;

import java.util.Scanner;

public class QB_14 {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount :");
		int balance = sc.nextInt();
		// try best but some help to chat gpt 
		if(100<=balance && balance%100==0){
			System.out.println("approve");
		}else {
			System.out.println("reject");
		}
		
	}
	
}
		// logic 

		//input balance
		// withdrawal amount
		//100<= balance print approve
		// other print reject
