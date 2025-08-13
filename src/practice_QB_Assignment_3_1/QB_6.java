package practice_QB_Assignment_3_1;

import java.util.Scanner;

public class QB_6 {

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 0 -100 marks :");
		int marks =input.nextInt();
		System.out.println("your marks is :"+marks);
		if(marks>90) {
			System.out.println("Grade A");
		}
		else if(marks>80) {
			System.out.println("Grade B");
		}
		else if(marks>70) {
			System.out.println("Grade C");
		}
		else if(marks>60) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
	}
	
}
