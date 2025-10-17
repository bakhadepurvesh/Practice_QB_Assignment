package for_Loop_4;

import java.util.Scanner;

public class QB_13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the odd number");
	int n =sc.nextInt();
	int odd = 0;
	for(int a=1;a<=n;a+=2){
	 odd = odd+a;
//	 System.out.println(odd);
	}
	 System.out.println(odd);
}
}
