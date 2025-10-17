package for_Loop_4;

import java.util.Scanner;

public class QB_12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the num ");
	int n =sc.nextInt();
	int  e=0;
	for(int a=2;a<=n;a+=2) {
		e = e+a;
	}
	System.out.println(e);
}
}
