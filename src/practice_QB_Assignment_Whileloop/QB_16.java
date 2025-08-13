package practice_QB_Assignment_Whileloop;

import java.util.Scanner;

public class QB_16 {
public static void main(String[] args) {
	//calculate the factorial of a number
	// formula  fact = fact*variable

	long facto =1;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number:");
	int fact=sc.nextInt();
	int i=1;
	while(i<fact){
		facto = facto * i;
		i++;
	}
	System.out.println();
}
// output not show problem

}
