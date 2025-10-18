package while_loop_4_1;

public class QB_17 {
public static void main(String[] args) {
	int number = 123;    		// starting number 
	int reverse = 0;			// variable to store the reversed number
	
	while(number!=0){			

		int digit = number%10;  			// get last digit of number
		reverse = reverse * 10 + digit;		// add the reversed number
         number/=10;						//remove last number from origin number 		
//		System.out.println(reverse);  
	}
	System.out.println(reverse); 			// print the number
}
}
