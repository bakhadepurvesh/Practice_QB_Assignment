package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_4 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the a:");
	int a = sc.nextInt();
	System.out.println("Enter the b:");
	int b = sc.nextInt();
	System.out.println("Enter the c:");
	int c = sc.nextInt();
	
	//side2+side3 > side1
	//side3+side1 > side2
	//side1+side2 > side3
	
	if(b+c>a && c+a>b && a+b>c){
		System.out.println("Triangle Valid");
	}else{
		System.out.println("Triangle not Valid");
	}

}
}
