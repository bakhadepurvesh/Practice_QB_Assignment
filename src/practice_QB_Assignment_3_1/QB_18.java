package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_18 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the side1 :");
	int side1 = sc.nextInt();
	System.out.println("enter the side2 :");
	int side2 = sc.nextInt();
	System.out.println("enter the side3 :");
	int side3 = sc.nextInt();
   
     	if(side1==side2 && side2==side3){
     		  System.out.println("equilateral :");
     	  }
     	  if(side1==side2 || side1==side3||side2==side3){
        	     System.out.println("isosceles :");
     		 }
     	  if(!(side1==side2)&& !(side1==side3)&&!(side2==side3)){
        	    	 System.out.println("Scalene triangle");
        	    } 
	    	    else {
	    	    	System.out.println("___");
	    	    	}
     		 
}
}
    //int equilateral = side1=side2=side3;
	//int isosceles a=b or a=c or b=c
	//else 
