package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_9 {
	
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int number = sc.nextInt();
	
	if(number>0){
		System.out.println("positive");
	}else if(0>number) {
		System.out.println("negative");
	}
	else if(number==0) {
		System.out.println("zero");
	}
	else {
		System.out.println("special character");
	}
}

}

//********************************************************************

//package practice_QB_Assignment_3_1;
//
//import java.util.Scanner;
//
//public class Practice {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Enter the number :");
//		int number = sc.nextInt();
//		
//		if(number>0 && number<0 && number==00){
//			System.out.println("positive");
//		}else if(number<0){
//			System.out.println("negative");
//		}else if(number==0) {
//			System.out.println("zero");
//		}
//		
//	}

//}
//*******************************************************************
//package practice_QB_Assignment_3_1;
//
//import java.util.Scanner;
//public class QB_9 {
//
//	public static void main(String[]args){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the your number ");
//		int number = sc.nextInt();
//		
//		if(0<number){
//			System.out.println("number is positive");
//			if(0>number) {
//			System.out.println("number is negative");
//			   if(number==0) {
//			    	System.out.println("number is Zero");
//			   }else {
//			    	System.out.println("number is not positive");
//					}
//			   }else{
//				 System.out.println("number is not negative");
//				}
//		}else {
//			 System.out.println("number is Zero");
//			}
//	
//}
//	
//}       // logic 
         //number > 0;  number is positive 
		//  0 > number ; number is negative
		// 0==0 ; equal or zero 
