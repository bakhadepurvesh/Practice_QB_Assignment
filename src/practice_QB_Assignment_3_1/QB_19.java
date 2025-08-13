package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_19 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number(a || b || c):");
	int  a =sc.nextInt();
	int  b =sc.nextInt();
	int  c =sc.nextInt();

	//  find odd variable%2==1 condition 
	if(a%2==1 && b%2==1 && c%2==1){
		System.out.println("Odd Chain");
	}
}

}
