package practice_QB_Assignment_Whileloop;

import java.util.Scanner;

public class QB_10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n");
	int a = 0;
	int n =sc.nextInt();
	while(a<=n) {
		if(a%2==0){
			System.out.println(a);
		}
		a++;
	}
}
}
