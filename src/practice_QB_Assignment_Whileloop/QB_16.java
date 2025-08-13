package practice_QB_Assignment_Whileloop;

import java.util.Scanner;

public class QB_16 {
public static void main(String[] args) {
	//calculate the factorial of a number
	// formula  fact = fact*variable

//
	Scanner sc =new Scanner(System.in);       
	System.out.println("Enter the number:");        // three line are scanner class part 
	int factoral=sc.nextInt();
	int i =1;
	int fact =1;
	while(i<=factoral) {
		fact = fact * i;
		i++;
		System.out.println(fact);
	}
	
}

}
