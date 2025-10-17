package for_Loop_4;

import java.util.Scanner;

public class QB_15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int num = sc.nextInt();
	System.out.println("Enter the power :");
	int power = sc.nextInt();
	int a =1;
	for(int b=1;b<=power;b++){
		a =a*num;
//		System.out.println(a);
	}
//	System.out.println(a);
}

}
