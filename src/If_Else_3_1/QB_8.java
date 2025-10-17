package If_Else_3_1;

import java.util.Scanner;

public class QB_8 {

	// help to bhaiya 
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2 :");
		int num2 = sc.nextInt();
		
		if(num1%2==1 && num2%2==1){
			System.out.println("absolute difference");
		}else{
			System.out.println("Invalid");
			
		}
		
		
	}
	
	
}
