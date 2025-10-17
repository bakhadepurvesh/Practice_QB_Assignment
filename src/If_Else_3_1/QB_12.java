package If_Else_3_1;

import java.util.Scanner;

public class QB_12 {

	public static void main(String[] args){
		// create scanner class object Scanner class already define 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1");
		int num1 = sc.nextInt();    // input point 
		System.out.println("Enter the value 2");
		int num2 = sc.nextInt();	// input point 
		System.out.println("Enter the choice");
		char choice = sc.next().charAt(0);
		
		//  open if block 1 
		if(choice == '+') {
			int sum = num1+num2;
			   System.out.println("Addition :"+sum); 
		   }// open else block 1
		else {
			// if block 2
			if(choice=='-') {
				int sub = num1-num2;
				System.out.println("Subtraction :"+sub);
			}
			// else block 2
			else {
				// if block 3
				if(choice=='*') {
					int mul =num1*num2;
					System.out.println("Multiplication :"+mul);
				}
				// else block 3
				else {
					// if block 4
					if(choice=='/'){
						int div = num1/num2;
						System.out.println("Division :"+div);
					}
					// else block 4
					else {
						System.out.println("Invalid number ");
					}
				}
			}	
		}
		
		}
			
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		switch (choice) {
//		case '+': {
//			int add=number1+number2;
//			System.out.println(add);
//			break;
//		}
//		case '-' : {
//			int sub=number1-number2;
//			System.out.println("subtract");
//			break;
//		}
//		case '*': {
//			int mul=number1*number2;
//			System.out.println("multiply");
//			break;
//		}
//		case '/': {
//			int div=number1/number2;
//			System.out.println("divide");
//			break;
//		}
//		default:
//			System.out.println("Invalid");
//		}
	
   

