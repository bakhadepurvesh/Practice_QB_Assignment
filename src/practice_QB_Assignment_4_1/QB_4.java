package practice_QB_Assignment_4_1;

import java.util.Scanner;

public class QB_4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int number =sc.nextInt();
	for(int a=10;a>=1;a--){
		System.out.println(a * number);
	}
}

}
