package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_1 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int larger = a>b ? a:b;  // condition 
		int smaller = b>a ? a:b; // condition  
		System.out.println("large num is :"+larger);
		if(larger%2==0){
			System.out.println("It is even");
		}
		else {
			System.out.println("It is Odd");
		}
	}
	
}
