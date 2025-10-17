package while_loop_4_2;

import java.util.Scanner;

public class QB_11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the n");
//	int n =sc.nextInt();
//	int n = 100;
//	int add =0;
//	for( int a=1;a<=n;a++){
//		add = add+a;
//		System.out.println(add);
//	}
	
	int n =sc.nextInt();
	int sum =0;
	int a = 1;
	while(a<=n){
		sum= sum+a;
		System.out.println(sum);
		a++;
	}
}
}
