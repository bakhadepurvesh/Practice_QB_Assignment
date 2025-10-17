package If_Else_3_1;

import java.util.Scanner;

public class QB_3 {

public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number ");
	int a = sc.nextInt();
	System.out.println("Enter your number ");
	int b = sc.nextInt();
	System.out.println("Enter your number ");
	int c = sc.nextInt();
	
	if(a>b && a>c){
		System.out.println("a is large");
	}
		if(b>a && b>c){
			System.out.println("b is large");
		} 
	else {
		System.out.println("c is large");
	}

}
	
}
