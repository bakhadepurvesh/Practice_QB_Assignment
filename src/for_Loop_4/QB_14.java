package for_Loop_4;

import java.util.Scanner;

public class QB_14 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the num ");
	int fact =input.nextInt();
	long facto =1;
	for(int i=1;i<=fact;i++) {
		facto = facto*i;
		System.out.println(facto);
	}
//	System.out.println(facto);
}
}
