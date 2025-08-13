package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_20 {

	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  your age :");
		int age = sc.nextInt();
		System.out.println("enter  your citizenship :");
		char citizenship = sc.next().charAt(0);
//		System.out.println("your citizenship :"+citizenship);
		
		if(age>=18){
			if(citizenship =='y' || citizenship=='Y'){
				System.out.println("Eligible to vote");
			}
		}
		
		
	}
	
	
}
