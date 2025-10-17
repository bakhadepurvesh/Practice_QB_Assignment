package for_Loop_4;

import java.util.Scanner;

public class QB_16 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
     int number = sc.nextInt();
     int reverse =0;
     // input one number 
     //123
     //321 
     //formula 
     //condition apply number is not 0
     for(;number!=0;number/=10){
    	  // number % 10 
    	  int b = number%10;
    	 reverse= reverse*10+b;
//    	 System.out.println(reverse);
     }
     System.out.println(reverse);
}

}
 
