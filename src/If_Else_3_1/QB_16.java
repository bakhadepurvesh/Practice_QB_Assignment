package If_Else_3_1;

import java.util.Scanner;

public class QB_16 {
	
private static final int C = 0;

public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the temp:");
	int temp =sc.nextInt();
	System.out.println("enter the unit:");
	char unit = sc.next().charAt(0);
	
	if(unit =='C'||unit=='c') {
		  int F =(temp*(9/5)+32);
		System.out.println("Fahrenheit"+F);
	}
	else if(unit =='F'||unit=='f'){
		int C =(temp-32*5/9);
		System.out.println("Celsius"+C);
	}
	else {
		System.out.println("not any one ");
	}

}

}
	    //input  a number 
		// input a unit 
		//(C or F)
		// conversion 
		// if C, convert Fahrenheit.
		// if F, convert Celsius.
