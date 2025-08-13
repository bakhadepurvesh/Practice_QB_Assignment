package practice_QB_Assignment_4_1;

import java.util.Scanner;

public class QB_17 {
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value:");
	int number = sc.nextInt();
	int b =number;
	 int valueReverse=0;
//	get input 
//	check input or output same or not
	for(;number>0;number/=10){
	   int result = number%10;
	   valueReverse  = valueReverse *10+result;
//	   System.out.println(valueReverse);
	}
	System.out.println(valueReverse);
	 if(valueReverse==b) {
			System.out.println("value right");
		} else {
			System.out.println("not right");
		}
}
}
