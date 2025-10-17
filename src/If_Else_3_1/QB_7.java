package If_Else_3_1;

import java.util.Scanner;

public class QB_7 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the your number :");
	int age = sc.nextInt();
	if(age<=12){
		System.out.println("you are child");
	}
	else if(age<=17) {
		System.out.println("you are Teen");
	}
	else if(age<=59) {
		System.out.println("you are Adult");
	}
	else if(age>=60){
		System.out.println("you are senior");
	}
	
	
}
}
